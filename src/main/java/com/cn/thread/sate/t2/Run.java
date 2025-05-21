package com.cn.thread.sate.t2;


public class Run {
    // NEW,
    // RUNNABLE,
    // TERMINATED,
    // BLOCKED,
    // WAITING,
    // TIMED WAITING,
    public static void main(String[] args) {
        try {
            MyThread t = new MyThread();
            t.start();
            Thread.sleep(1000);
            System.out.println("main 方法中的状态:" + t.getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
