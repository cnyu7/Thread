package com.cn.thread.communication.t5;


public class Test {
    public static void main(String[] args) throws InterruptedException {
        MyList service = new MyList();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();
        Thread.sleep(50);
        a.start();

    }
}
