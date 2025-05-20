package com.cn.thread.lock.t2;

public class ThreadB extends Thread{
    private MyService service;

    public ThreadB(MyService service){
        this.service = service;
    }

    public void run(){
        service.methodB();
    }
}
