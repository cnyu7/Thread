package com.cn.thread.lock.reentrantreadwritelock.t1;

public class ThreadB extends Thread {
    private Service service;

    public ThreadB(Service service) {
        this.service = service;
    }

    public void run() {
        service.write();
    }
}
