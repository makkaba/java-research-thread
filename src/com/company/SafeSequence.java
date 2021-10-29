package com.company;

import net.jcip.annotations.ThreadSafe;

@ThreadSafe
public class SafeSequence {
    private int count = 0;
    public synchronized void next() {
        int temp = this.count;
        Thread.yield();
        this.count = temp+10;
    }
    public int getCount(){
        return count;
    }
}
