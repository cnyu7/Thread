package com.cn.thread.lock.t19;

public class MyThreadB extends Thread {
    private Service service;

    public MyThreadB(Service service) {
        this.service = service;
    }

    public void run() {
        service.notifyMethod();
    }

}
