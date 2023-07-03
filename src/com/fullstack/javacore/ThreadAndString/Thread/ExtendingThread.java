package com.fullstack.javacore.ThreadAndString.Thread;

 public class ExtendingThread extends Thread {
        public void run() {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
            }
        }

        public static void main(String[] args) {
            ExtendingThread thread = new ExtendingThread();
            thread.start();
        }
    }


