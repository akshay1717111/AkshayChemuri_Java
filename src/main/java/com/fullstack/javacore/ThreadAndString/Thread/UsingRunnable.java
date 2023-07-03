package com.fullstack.javacore.ThreadAndString.Thread;

class NumberPrinter implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}

public class UsingRunnable {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new NumberPrinter());
        thread.start();

    }
}
