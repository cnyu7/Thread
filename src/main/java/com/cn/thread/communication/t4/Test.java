package com.cn.thread.communication.t4;


public class Test {
    public static void main(String[] args) throws InterruptedException {
        MyList service = new MyList();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(service);
        b.setName("B");
        Thread.sleep(1000);
        b.start();
    }
}
