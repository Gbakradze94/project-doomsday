package org.gbakradze.concurrency.thread.states;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimedWaitingStateDemoTest {

    @Test
    void testThreadStateInTimedWaiting() throws InterruptedException {
        TimedWaitingStateDemo timedWaitingStateDemo = new TimedWaitingStateDemo();
        var threadState = timedWaitingStateDemo.getIntoTimedWaiting();

        assertEquals("TIMED_WAITING", threadState);
    }
}
