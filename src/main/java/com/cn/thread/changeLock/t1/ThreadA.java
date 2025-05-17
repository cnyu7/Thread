package com.cn.thread.changeLock.t1;


public class ThreadA extends Thread{

    private MyService service;

    public ThreadA(MyService service) {
        this.service = service;
    }

    public void run() {
        service.testMethod();
    }
}
