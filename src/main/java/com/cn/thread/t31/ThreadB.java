package com.cn.thread.t31;

public class ThreadB extends Thread{

    private Service service;
    private MyObject myObject;

    public ThreadB(Service service, MyObject myObject) {
        this.service = service;
        this.myObject = myObject;
    }

    public void run() {
        service.testMethod1(myObject);
    }
}
