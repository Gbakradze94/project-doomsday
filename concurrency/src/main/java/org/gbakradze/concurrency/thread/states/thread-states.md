## Thread States
A thread can be in one of the following states:

* NEW - A thread that has been created but not yet started is in this state.
* RUNNABLE - A thread is in this state if it is either running or ready to run,
but waiting for resource allocation from the system.
* BLOCKED - A thread that is blocked waiting for a monitor 
lock to enter or re-enter a synchronized block/method.
* WAITING
* TIMED_WAITING
* TERMINATED - A thread that has exited is in this state.


TIMED_WAITING
According to the Java documentation there are five ways to put a thread into
TIMES_WAITING state:
* Thread.sleep(long millis)
* Object.wait(long timeout)
* Thread.join(long millis)
* LockSupport.parkNanos(long nanos)
* LockSupport.parkUntil(long deadline)

In the class TimedWaitingStateDemo, we demonstrate how to get the
thread into TIMED_WAITING state using Thread.sleep() method. Just by
calling this method, the current thread will sleep for 5 seconds,
and during this time, it will be in TIMED_WAITING state.
```java
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
```
