package org.gbakradze.concurrency.thread.states;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ThreadStateDemoTest {

    @Test
    public void testCreateThreadInNewState() {
        ThreadStateDemo threadStateDemo = new ThreadStateDemo();
        String threadState = threadStateDemo.createThreadInNewState();

        assertEquals("NEW", threadState);
    }


    @Test
    void testGetThreadStateIntoRunnable() {
        ThreadStateDemo threadStateDemo = new ThreadStateDemo();
        String threadState = threadStateDemo.getThreadStateIntoRunnable();

        assertEquals("RUNNABLE", threadState);
    }


    @Test
    void testGetThreadStateIntoBlocked() throws InterruptedException {
        ThreadStateDemo threadStateDemo = new ThreadStateDemo();
        String threadState = threadStateDemo.getThreadStateIntoBlocked();

        assertEquals("BLOCKED", threadState);
    }
}
