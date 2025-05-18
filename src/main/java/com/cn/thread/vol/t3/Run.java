package com.cn.thread.vol.t3;

public class Run {
    public static void main(String[] args) {
        try {
            RunThread thread = new RunThread();
            thread.start();
            Thread.sleep(1000);
            thread.setRunning(false);
            System.out.println("已经赋值为 false");
            System.out.println(thread.isRunning());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}