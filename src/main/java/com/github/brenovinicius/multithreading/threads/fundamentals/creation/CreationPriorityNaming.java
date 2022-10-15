package com.github.brenovinicius.multithreading.threads.fundamentals.creation;

/**
 * Threads Creation - Part 1. Thread Creation, naming and priority
 */
public class CreationPriorityNaming {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            System.out.println("We are now in thread " + Thread.currentThread().getName());
            System.out.println("Current thread priority is " + Thread.currentThread().getPriority());
        });

        thread.setName("New worker Thread");

        thread.setPriority(Thread.MAX_PRIORITY);

        System.out.println("We are in thread: " + Thread.currentThread().getName() + " before staring a new thread");
        thread.start();
        System.out.println("We are in thread: " + Thread.currentThread().getName() + " after staring a new thread");
        Thread.sleep(10000);
    }
}
