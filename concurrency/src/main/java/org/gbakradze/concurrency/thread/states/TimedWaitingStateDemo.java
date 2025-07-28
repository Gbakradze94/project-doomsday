package org.gbakradze.concurrency.thread.states;

public class TimedWaitingStateDemo {
    public String getIntoTimedWaiting() throws InterruptedException {
        TimedWaitingRunnable runnable = new TimedWaitingRunnable();
        Thread t1 = new Thread(runnable);
        t1.start();

        Thread.sleep(1000);
        return t1.getState().name();
    }
}

class TimedWaitingRunnable implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(5000); // Simulating a timed waiting state
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            e.printStackTrace();
        }
        System.out.println("Thread is in Timed Waiting state");
    }
}