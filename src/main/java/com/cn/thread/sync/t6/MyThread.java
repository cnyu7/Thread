package com.cn.thread.sync.t6;

public class MyThread extends Thread {
    public MyThread() {
        System.out.println("构造方法的打印: " + Thread.currentThread().getName());
    }

    @Override
    public void run() {
        System.out.println("run 方法的打印:" + Thread.currentThread().getName());
    }
}
