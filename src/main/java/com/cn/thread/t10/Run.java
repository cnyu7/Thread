package com.cn.thread.t10;

public class Run {
    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(1000);
            thread.interrupt();
Thread.currentThread().interrupt();
            System.out.println("是否停止1? =" + new MyThread().interrupted());
            System.out.println("是否停止2? =" + new MyThread().interrupted());
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end!");
    }
}
