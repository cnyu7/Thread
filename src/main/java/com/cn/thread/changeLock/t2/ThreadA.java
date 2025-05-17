package com.cn.thread.changeLock.t2;



public class ThreadA extends Thread{

    private Service service;
    private Userinfo userinfo;

    public ThreadA(Service service, Userinfo userinfo) {
        this.service = service;
        this.userinfo = userinfo;
    }

    public void run() {
        service.serviceMethodA(userinfo);
    }
}
