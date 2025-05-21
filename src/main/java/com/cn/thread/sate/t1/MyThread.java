package com.cn.thread.sate.t1;

public class MyThread extends Thread {

    public MyThread() {
        System.out.println("构造方法中的状态 " + Thread.currentThread().getName() + " name：" + Thread.currentThread().getState());
    }

    @Override
    public void run() {
        System.out.println("run 方法中的状态: " + Thread.currentThread().getName() + " name：" + Thread.currentThread().getState());
    }
}
