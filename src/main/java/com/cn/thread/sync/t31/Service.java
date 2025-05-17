package com.cn.thread.sync.t31;

public class Service {
    public void testMethod1(MyObject object) {
        synchronized (object) {
            try {
                System.out.println("testMethodl getLock time="
                        + System.currentTimeMillis() + " run ThreadName="
                        + Thread.currentThread().getName());
                Thread.sleep(2000);
                System.out.println("testMethodl releaseLock time="
                        + System.currentTimeMillis() + " run ThreadName="
                        + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
