package com.cn.thread.stat.t2;

public class ThreadC extends Thread{

    private Service service;

    public ThreadC(Service service) {
        this.service = service;
    }

    @Override
    public void run () {
        service.printC();
    }
}
