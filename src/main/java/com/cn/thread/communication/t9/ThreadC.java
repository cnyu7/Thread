package com.cn.thread.communication.t9;


public class ThreadC extends Thread {
    private Object lock;

    public ThreadC(Object lock) {
        this.lock = lock;
    }

    public void run() {
        Service service = new Service();
        service.testMethod(lock);
    }
}
