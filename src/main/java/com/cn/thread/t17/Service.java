package com.cn.thread.t17;

public class Service {

    synchronized public void servicel() {
        System.out.println("servicel");
        service2();
    }

    synchronized public void service2() {
        System.out.println("service2");
        service3();
    }
    synchronized public void service3 () {
        System.out.println("service3");
    }
}
