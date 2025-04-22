package com.mintpayments.test.scheduler;

import org.junit.jupiter.api.Test;

import java.util.concurrent.locks.LockSupport;

public class SimpleTaskSchedulerTest {
    @Test
    void test1() throws InterruptedException {
        TaskScheduler scheduler = new SimpleTaskScheduler();
        scheduler.start();

        Runnable task = () -> {
            System.out.println("Simulating thread (" + Thread.currentThread().threadId() + ") I/O wait...");
            LockSupport.parkNanos(2_000_000_000L); // 2 second
            System.out.println("Finished I/O wait (thread " + Thread.currentThread().threadId() + ")  returning from task.");
        };
        scheduler.submit(task);
        scheduler.submit(task);
        scheduler.submit(task);
        System.out.println("Submitted 3 tasks, starting to stop.");
        scheduler.stop();
        System.out.println("Scheduler stopped, returning from test1.");
    }
}
