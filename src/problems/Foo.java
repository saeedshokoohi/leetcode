package problems;

public class Foo {
  volatile boolean isLock=false;
    public Foo() {

    }

    public void first(Runnable printFirst) throws InterruptedException {
       lock();

        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
     unlock();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        lock();
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        unlock();
    }

    public void third(Runnable printThird) throws InterruptedException {
        lock();
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
        unlock();
    }
    void lock()
    {
        isLock=true;
        while (isLock)
        {

        }
    }
    void unlock()
    {
        isLock=false;
    }
}
