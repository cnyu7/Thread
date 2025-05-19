package com.cn.thread.join.t4;

public class ThreadA extends Thread {
    private ThreadB b;

    public ThreadA(ThreadB b) {
        super();
        this.b = b;
    }

    @Override
    public void run() {
        try {
            synchronized (b) {
                b.start();
                b.join();
                // Thread.sleep(3000);
// Thread.sleep()不释放锁!
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
