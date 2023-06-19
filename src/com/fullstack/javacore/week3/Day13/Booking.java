package com.fullstack.javacore.week3.Day13;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Booking {

    private static int availableTickets = 10;
    private static Lock lock = new ReentrantLock();

    public static void main(String[] args) {
        Thread[] threads = new Thread[5];

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(new BookingThread());
            threads[i].start();
        }

        for (int i = 0; i < threads.length; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("All tickets booked. Available tickets: " + availableTickets);
    }

    static class BookingThread implements Runnable {
        @Override
        public void run() {
            try {

                Thread.sleep((long) (Math.random() * 1000));


                lock.lock();

                if (availableTickets > 0) {
                    // Book the ticket
                    System.out.println("Ticket booked by Thread " + Thread.currentThread().getId());
                    availableTickets--;
                } else {
                    System.out.println("No more tickets available for Thread " + Thread.currentThread().getId());
                }

                // Release the lock
                lock.unlock();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
