package com.cn.thread.t12;

public class Run2 {

    public static void main(String[] args) {

        MyThread2 thread = new MyThread2();
        thread.start();
        thread.interrupt();
        System.out.println("end!");
    }
}
