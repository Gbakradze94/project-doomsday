package org.gbakradze.concurrency.thread.states;

public class WaitingStateDemo implements Runnable {

    public static Thread t1;
    public void startFirstThread() {
        t1 = new Thread(new WaitingStateDemo());
        t1.start();
    }

    @Override
    public void run() {
        Thread t2 = new Thread(new SecondThreadTask());
        t2.start();

        try {
            t2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException(e);
        }
    }
}

class SecondThreadTask implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            e.printStackTrace();
        }
        System.out.println(WaitingStateDemo.t1.getState());
    }
}
