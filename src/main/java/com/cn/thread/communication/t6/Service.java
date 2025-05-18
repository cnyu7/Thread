package com.cn.thread.communication.t6;

public class Service {
    public void testMethod(Object lock) {
        try {
            synchronized (lock) {
                System.out.println("begin wait() " + System.currentTimeMillis());
//                lock.wait();
                Thread.sleep(2000);
                System.out.println("end   wait() " + System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}