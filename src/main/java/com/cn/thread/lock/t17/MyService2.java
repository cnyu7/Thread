package com.cn.thread.lock.t17;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class MyService2 {
    public ReentrantLock lock = new ReentrantLock();

    public void waitMethod() {
        try {
            if (lock.tryLock(3, TimeUnit.SECONDS)) {
                System.out.println(Thread.currentThread().getName() + "获得锁时间" + System.currentTimeMillis());
            } else {
                System.out.println(Thread.currentThread().getName() + "没有获得锁"+ System.currentTimeMillis());
            }
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }finally {
            if (lock.isHeldByCurrentThread()){
                lock.unlock();
            }
        }
    }
}
