package com.cn.thread.t33;

public class Service {
    public void testMethod1(MyObject object) {
        synchronized (object) {
            try {
                System.out.println("testMethod1 _getLock time="
                        + System.currentTimeMillis() + " run ThreadName="
                        + Thread.currentThread().getName());
                Thread.sleep(5000);
                System.out.println("testMethodl releaseLock time="
                        + System.currentTimeMillis() + " run ThreadName="
                        + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();

            }
        }
    }
}