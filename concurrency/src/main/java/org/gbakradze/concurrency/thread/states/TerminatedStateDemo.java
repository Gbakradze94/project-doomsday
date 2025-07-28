package org.gbakradze.concurrency.thread.states;

public class TerminatedStateDemo {

    public String terminateThread() throws InterruptedException {

        Task task = new Task();
        Thread thread = new Thread(task);
        thread.start();
        Thread.sleep(8000);
        return thread.getState().name();
    }

}

class Task implements Runnable {

    @Override
    public void run() {
       // Nothing here
    }
}
