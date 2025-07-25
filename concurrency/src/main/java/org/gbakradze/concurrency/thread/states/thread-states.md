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
