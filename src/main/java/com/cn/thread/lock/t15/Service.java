package com.cn.thread.lock.t15;

import java.util.concurrent.locks.ReentrantLock;

public class Service {
    public ReentrantLock lock;

    public Service(boolean isFair) {
        super();
        lock = new ReentrantLock(isFair);
    }

    public void serviceMethod() {
        try {
            System.out.println("当前线程："+Thread.currentThread().getName() + " "+lock.isHeldByCurrentThread());
            System.out.println("isLocked："+lock.isLocked());
            lock.lock();
            System.out.println("当前线程："+Thread.currentThread().getName() + " "+lock.isHeldByCurrentThread());
            System.out.println("isLocked："+lock.isLocked());
        } finally {
            lock.unlock();
        }
    }
}
