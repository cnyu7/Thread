package com.cn.thread.changeLock.t1;


public class ThreadB extends Thread{

    private MyService service;

    public ThreadB(MyService service) {
        this.service = service;
    }

    public void run() {
        service.testMethod();
    }
}
