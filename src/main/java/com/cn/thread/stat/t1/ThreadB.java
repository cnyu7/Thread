package com.cn.thread.stat.t1;

public class ThreadB extends Thread{

    @Override
    public void run () {
        Service.printA();
    }
}
