package problems;

import org.junit.Test;

import java.util.function.IntConsumer;

public class ZeroEvenOddTest {
    @Test
    public void printZeroEventTest()
    {
        //given
        ZeroEvenOdd testClass=new ZeroEvenOdd(7);
        IntConsumer printInt=new IntConsumer() {
            @Override
            public void accept(int value) {
                System.out.print(value);
            }
        };
        Runnable runnableZero=new Runnable() {
            @Override
            public void run() {
                try {
                    testClass.zero(printInt);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Runnable runnableEven=new Runnable() {
            @Override
            public void run() {
                try {
                    testClass.even(printInt);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Runnable runnableOdd=new Runnable() {
            @Override
            public void run() {
                try {
                    testClass.odd(printInt);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        new Thread(runnableZero,"Zero").start();
        new Thread(runnableEven,"Even").start();
        new Thread(runnableOdd,"Odd").start();




    }
}
