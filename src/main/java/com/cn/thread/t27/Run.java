package com.cn.thread.t27;


public class Run {

    public static void main(String[] args) throws InterruptedException {
        Service task = new Service();
        MyThread1 thread1 = new MyThread1(task);
        thread1.setName("A");
        thread1.start();
        Thread.sleep(100);
        MyThread2 thread2 = new MyThread2(task);
        thread2.setName("B");
        thread2.start();

    }
}
