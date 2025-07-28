package org.gbakradze.concurrency.thread.creation;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceDemo {

    /**
     * Creates a thread using ExecutorService's submit method.
     * submit() method returns a Future object that can be used
     * to retrieve the result of the computation.
     * @return Future<String> representing the result of the task
     */
    public Future<String> useExecutorsSubmitMethod() {
        ExecutorService executor = Executors.newFixedThreadPool(10);

        return executor.submit(() -> "Task 1 is running");
    }
}
