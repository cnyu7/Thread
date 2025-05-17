package com.cn.thread.changeLock.t1;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        ThreadB b = new ThreadB(service);
        b.setName("B");
        a.start();
//        Thread.sleep(50);//存在50 毫秒
        b.start();
    }
}
