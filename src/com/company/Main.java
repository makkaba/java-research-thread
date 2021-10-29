package com.company;

public class Main {

    public static void main(String[] args) {

        Runnable task = new Task(new UnsafeSequence());
        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        Thread thread3 = new Thread(task);
        thread1.start();
        thread2.start();
        thread3.start();

    }
}
