package com.cn.thread.vol.t6;

public class MyThread extends Thread {
    private MyService mySerivce;

    public MyThread(MyService mySerivce) {
        super();
        this.mySerivce = mySerivce;
    }

    @Override
    public void run() {
        mySerivce.addNum();
    }
}
