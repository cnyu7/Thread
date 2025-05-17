package com.cn.thread.sync.t10;

public class Run3 {

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
        thread.interrupt();
//            Thread.currentThread().interrupt();
        System.out.println("是否停止1? =" + thread.isInterrupted());
        System.out.println("是否停止2? =" + thread.isInterrupted());

    }
}
