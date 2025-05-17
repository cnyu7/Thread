package com.cn.thread.sync.t6;

public class Run {
    public static void main(String[] args) {
        MyThread mythread = new MyThread();
        mythread.start();
//            mythread.run();
    }
}
