package com.company;

import net.jcip.annotations.NotThreadSafe;

@NotThreadSafe
public class UnsafeSequence {
    private int count = 0;
    public void next() {
        //not safe section
        int temp = this.count;
        Thread.yield();
        this.count = temp+10;
    }
    public int getCount(){
        return count;
    }

}
