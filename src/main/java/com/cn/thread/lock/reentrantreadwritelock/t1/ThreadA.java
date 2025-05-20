package com.cn.thread.lock.reentrantreadwritelock.t1;

public class ThreadA extends Thread {
    private Service service;

    public ThreadA(Service service) {
        this.service = service;
    }

    public void run() {
        service.read();
        // service.write();
    }
}
