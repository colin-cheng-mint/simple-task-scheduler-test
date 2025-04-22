package com.mintpayments.test.scheduler;

public interface TaskScheduler {
    void submit(Runnable task);  // Thread-safe
    void start();                // Starts worker thread (non-blocking)
    void stop();                 // Gracefully stops the scheduler
}
