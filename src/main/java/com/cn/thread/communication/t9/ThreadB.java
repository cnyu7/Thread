package com.cn.thread.communication.t9;


public class ThreadB extends Thread {
    private Object lock;

    public ThreadB(Object lock) {
        this.lock = lock;
    }

    public void run() {
        Service service = new Service();
        service.testMethod(lock);
    }
}
