package com.cn.thread.communication.t12;

public class Run {

    public static void main(String[] args) {
        String lock = new String("");
        P p = new P(lock);
        C c = new C(lock);
        ThreadP pThread = new ThreadP(p);
        ThreadC rThread = new ThreadC(c);
        pThread.start();
        rThread.start();
    }

}