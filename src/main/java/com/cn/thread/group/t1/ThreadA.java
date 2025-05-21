package com.cn.thread.group.t1;

public class ThreadA extends Thread {
    public void run() {
        while (true) {
            try {
                Thread.sleep(3000);
                System.out.println("ThreadName=" + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
