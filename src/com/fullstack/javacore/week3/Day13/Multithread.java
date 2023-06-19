package com.fullstack.javacore.week3.Day13;

import java.util.Arrays;

public class Multithread {

    private static final int ARRAY_SIZE = 100;
    private static final int THREAD_COUNT = 5;

    private static int[] array = new int[ARRAY_SIZE];
    private static int[] partialSums = new int[THREAD_COUNT];
    private static int finalSum = 0;

    public static void main(String[] args) {
        // Initialize the array with values from 1 to 100
        for (int i = 0; i < ARRAY_SIZE; i++) {
            array[i] = i + 1;
        }

        // Create and start the threads
        Thread[] threads = new Thread[THREAD_COUNT];
        for (int i = 0; i < THREAD_COUNT; i++) {
            threads[i] = new SumThread(i);
            threads[i].start();
        }

        // Wait for all threads to finish
        try {
            for (int i = 0; i < THREAD_COUNT; i++) {
                threads[i].join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Calculate the final sum
        for (int i = 0; i < THREAD_COUNT; i++) {
            finalSum += partialSums[i];
        }

        // Print the final sum
        System.out.println("Final Sum: " + finalSum);
    }

    static class SumThread extends Thread {
        private int threadIndex;

        public SumThread(int threadIndex) {
            this.threadIndex = threadIndex;
        }

        @Override
        public void run() {
            int start = threadIndex * (ARRAY_SIZE / THREAD_COUNT);
            int end = (threadIndex + 1) * (ARRAY_SIZE / THREAD_COUNT);
            int sum = 0;

            for (int i = start; i < end; i++) {
                sum += array[i];
            }

            partialSums[threadIndex] = sum;
        }
    }
}

