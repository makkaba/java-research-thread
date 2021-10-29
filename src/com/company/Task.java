package com.company;

public class Task implements Runnable {
    private UnsafeSequence sequence;
    public Task(UnsafeSequence sequence){
        this.sequence = sequence;
    }
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            this.sequence.next();
            System.out.println( Thread.currentThread() + ": " + this.sequence.getCount());
        }

    }
}
