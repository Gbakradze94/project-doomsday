package org.gbakradze.concurrency.thread.states;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WaitingStateDemoTest {

    @Test
    public void testThreadStateInWaiting() throws InterruptedException {
        WaitingStateDemo waitingStateDemo = new WaitingStateDemo();
        waitingStateDemo.startFirstThread();

        Thread.sleep(100);

        assertEquals(Thread.State.WAITING, WaitingStateDemo.t1.getState());
    }

}