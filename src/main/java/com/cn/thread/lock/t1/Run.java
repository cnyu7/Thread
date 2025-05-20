package com.cn.thread.lock.t1;

public class Run {
    public static void main(String[] args) {
        MyService service = new MyService();
        MyThread al = new MyThread(service);
        MyThread a2 = new MyThread(service);
        MyThread a3 = new MyThread(service);
        MyThread a4 = new MyThread(service);
        MyThread a5 = new MyThread(service);
        al.start();
        a2.start();
        a3.start();
        a4.start();
        a5.start();
    }
}
