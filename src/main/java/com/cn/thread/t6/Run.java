package com.cn.thread.t6;

public class Run {
    public static void main(String[] args) {
        MyThread mythread = new MyThread();
        mythread.start();
//            mythread.run();
    }
}
