package com.cn.thread.stat.t1;

public class ThreadA extends Thread{

    @Override
    public void run () {
        Service.printA();
    }
}
