package com.cn.thread.t32;


public class ThreadA extends Thread{

    private Service service;
    private MyObject myObject;

    public ThreadA(Service service, MyObject myObject) {
        this.service = service;
        this.myObject = myObject;
    }

    public void run() {
        service.testMethod1(myObject);
    }
}
