package com.cn.thread.sate.t3;

public class Run {

    public static void main(String[] args) throws InterruptedException {

        MyThread1 t1 = new MyThread1();
        t1.setName("a");
        t1.start();
        MyThread2 t2 = new MyThread2();
        t2.setName("b");
        t2.start();
        Thread.sleep(1000);
        System.out.println("main方法中的t2状态:" + t2.getState());
    }
}
