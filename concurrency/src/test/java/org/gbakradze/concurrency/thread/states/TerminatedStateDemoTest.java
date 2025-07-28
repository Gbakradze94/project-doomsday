package org.gbakradze.concurrency.thread.states;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TerminatedStateDemoTest {

    @Test
    public void testThreadStateInTerminated() throws InterruptedException {
        TerminatedStateDemo terminatedStateDemo = new TerminatedStateDemo();
        var threadState = terminatedStateDemo.terminateThread();

        assertEquals("TERMINATED",threadState);
    }
}