package problems;

import org.junit.Test;

public class PrintFooBarAlternatelyTest {

    @Test
    public void printFoobarTest() {
        //given
        PrintFooBarAlternately testClass = new PrintFooBarAlternately(5);
        Runnable printFooRunnable = new Runnable() {
            @Override
            public void run() {
                System.out.print("foo");
            }
        };
        Runnable printBarRunnable = new Runnable() {
            @Override
            public void run() {
                System.out.print("bar");
            }
        };

        Runnable ARunnable = new Runnable() {
            @Override
            public void run() {
                try {
                    testClass.foo(printFooRunnable);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        };

        Runnable BRunnable = new Runnable() {
            @Override
            public void run() {
                try {
                    testClass.bar(printBarRunnable);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        };

       new Thread(ARunnable,"A").start();
       new Thread(BRunnable,"B").start();
    }
}
