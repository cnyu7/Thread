package com.cn.thread.communication.t10;

public class MyRunnable2 {
    static private Object lock = new Object();
    static private Runnable task = new Runnable() {
        @Override
        public void run() {
            try {
                synchronized (lock) {
                    System.out.println("wait begin timer="
                            + System.currentTimeMillis());
                    lock.wait(5000);
                    System.out.println("wait   end timer="
                            + System.currentTimeMillis());
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };
    static private Runnable task2 = new Runnable() {
        @Override
        public void run() {
            synchronized (lock) {
                System.out.println("notify begin timer="
                        + System.currentTimeMillis());
                lock.notify();
                System.out.println("notify   end timer="
                        + System.currentTimeMillis());
            }
        }
    };
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(task);
        t.start();
        Thread t2 = new Thread(task2);
        Thread.sleep(3000);
        t2.start();
    }
}
