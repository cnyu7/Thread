package com.cn.thread.sync.t12;

public class Run {
    public static void main(String[] args) {

        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(200);
            thread.interrupt();
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end!");

    }
}
