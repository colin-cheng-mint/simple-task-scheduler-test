# Task Scheduler – Live Coding Challenge

## ⏱️ Time Limit

Approximately **20–30 minutes**. Please keep your solution simple and clean.

This task is designed for **live coding interviews** using screen sharing. You can use your preferred IDE and Java version (8+).

---

## 🎯 Objective

Implement a basic **task scheduler** that accepts tasks (`Runnable`) from multiple threads and ensures all tasks are executed sequentially by a **_single_** worker thread.

---

## 🛠️ Requirements

Implement a `TaskScheduler` class with the following methods:

```java
public class TaskScheduler {
    void submit(Runnable task);  // Thread-safe
    void start();                // Starts worker thread (non-blocking)
    void stop();                 // Gracefully stops the scheduler
}
```
- submit(Runnable task) can be called concurrently.
- All submitted tasks must be executed in the order received.
- start() should immediately return, while starting the background worker thread.
- stop() should wait until all submitted tasks have finished before shutting down.
- Use standard Java concurrency tools: Thread, BlockingQueue, Atomic Operations, ReentrantLock, etc.

## 🚀 Bonus (Optional)
If you have time or want to show deeper skill:
- ✅ Add a limit to the maximum number of queued tasks.
- ✅ Add an optional callback after task execution (synchronous or asynchronous).
- ✅ Add basic error handling/logging around task execution.
