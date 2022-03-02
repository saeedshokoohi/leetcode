package problems;

import java.util.concurrent.Semaphore;

public class H2O {
    private Semaphore h2,o;
    public H2O() {
        h2=new Semaphore(2);
        o=new Semaphore(0);

    }

    public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {


        h2.acquire();
        // releaseHydrogen.run() outputs "H". Do not change or remove this line.
        releaseHydrogen.run();
        if(h2.availablePermits()==0)o.release();

    }

    public void oxygen(Runnable releaseOxygen) throws InterruptedException {

        o.acquire();
        // releaseOxygen.run() outputs "O". Do not change or remove this line.
        releaseOxygen.run();
        h2.release(2);
    }
}
