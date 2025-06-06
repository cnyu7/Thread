package com.cn.thread.communication.t9;

public class NotifyThread extends Thread {
    private Object lock;

    public NotifyThread(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
//            lock.notifyAll();
            lock.notify();
        }
    }
}
