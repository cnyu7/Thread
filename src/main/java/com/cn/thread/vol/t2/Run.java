package com.cn.thread.vol.t2;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        PrintString printStringService = new PrintString();
        new Thread(printStringService).start();
        System.out.println("我要停止它! stopThread="
                + Thread.currentThread().getName());
        Thread.sleep(5000);
        printStringService.setContinuePrint(false);
    }
}
