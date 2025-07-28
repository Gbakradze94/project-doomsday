package org.gbakradze.concurrency.thread.creation;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import static org.junit.jupiter.api.Assertions.*;

class ExecutorServiceDemoTest {

    @Test
    public void testCreateThreadUsingExecutorService() throws ExecutionException, InterruptedException {
        ExecutorServiceDemo executorServiceDemo = new ExecutorServiceDemo();
        Future<String> future = executorServiceDemo.useExecutorsSubmitMethod();

        assertEquals("Task 1 is running", future.get());
    }
}