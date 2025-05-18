package com.cn.thread.vol.t7;

public class Service {
    private boolean isContinueRun = true;

    public void runMethod() {
        while (isContinueRun == true) {
            synchronized (this){
                System.out.println("进入同步代码块!");
            }
        }
        System.out.println("停下来了!");
    }

    public void stopMethod() {
        System.out.println("已经发起停止的命令了!");
        isContinueRun = false;
    }
}
