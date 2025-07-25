package org.gbakradze.concurrency.thread.states;


/**
 * A thread is in the NEW state when it is created but not yet started.
 *  In this state, the thread is not yet eligible for execution.
  */
public class ThreadStateDemo {
    public String createThreadInNewState() {

        Runnable task = () -> System.out.println("Thread is running");
        Thread thread = new Thread(task);

        return thread.getState().name();
    }

    /**
     * Note: It is not always guaranteed that a thread will be in the RUNNABLE
     * state immediately after calling start().
     * The exact moment the thread enters the RUNNABLE state is managed by the
     * JVM thread scheduler, which delegates to the underlying OS scheduler.
     */
    public String getThreadStateIntoRunnable() {
        Runnable task = () -> System.out.println("Thread is running");
        Thread thread = new Thread(task);

        thread.start();
        return thread.getState().name();
    }

    public String getThreadStateIntoBlocked() throws InterruptedException {
        Thread thread1 = new Thread(new BlockedRunnableDemo());
        Thread thread2 = new Thread(new BlockedRunnableDemo());

        thread1.start();
        thread2.start();

        Thread.sleep(1000);


        return thread2.getState().name();
    }

}

class BlockedRunnableDemo implements Runnable {
    @Override
    public void run() {
       commonResource();
    }

    public static synchronized void commonResource() {
        while (true) {

        }
    }
}
