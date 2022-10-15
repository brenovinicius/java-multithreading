package com.github.brenovinicius.multithreading.threads.fundamentals.creation;

/**
 * Threads Creation - Part 2. Thread Concrete Class
 */
public class ConcreteClass {

    public static void main(String[] args) {
        Thread thread = new NewThread();
        thread.start();
    }

    private static class NewThread extends Thread {
        @Override
        public void run() {
            System.out.println("Hello from " + this.getName());
        }
    }
}
