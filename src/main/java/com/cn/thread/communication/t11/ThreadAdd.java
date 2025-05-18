package com.cn.thread.communication.t11;

public class ThreadAdd extends Thread{
    private Add add;

    public ThreadAdd(Add add) {
        this.add = add;
    }

    @Override
    public void run() {
        add.add();
    }
}
