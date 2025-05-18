package com.cn.thread.communication.t11;

public class ThreadSub extends Thread {
    private Subtract subtract;

    public ThreadSub(Subtract subtract) {
        this.subtract = subtract;
    }

    @Override
    public void run() {
//        subtract.subtract();
        subtract.subtract2();
    }
}
