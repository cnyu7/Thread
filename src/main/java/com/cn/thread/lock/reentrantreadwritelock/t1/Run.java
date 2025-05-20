package com.cn.thread.lock.reentrantreadwritelock.t1;


/**
 * 写读 操作也是互斥的。
 * 读写、写读 和 写写 都是互斥的；读读是异步的,非互斥的。
 * 即只要出现 写操作 的过程,就是互斥的。
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();
        Thread.sleep(1000);
        a.start();
    }
}
