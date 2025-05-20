package com.cn.thread.lock.t7;

public class Run {
    public static void main(String[] args) {

        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        ThreadB b = new ThreadB(service);
        a.start();
        b.start();
    }
}
