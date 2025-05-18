package com.cn.thread.vol.t7;

public class Service {
    private boolean isContinueRun = true;

    public void runMethod() {
        while (isContinueRun == true) {
            synchronized (this){

            }
        }
        System.out.println("停下来了!");
    }

    public void stopMethod() {
        isContinueRun = false;
    }
}
