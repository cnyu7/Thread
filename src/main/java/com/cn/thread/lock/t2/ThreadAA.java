package com.cn.thread.lock.t2;

public class ThreadAA extends Thread{
    private MyService service;

    public ThreadAA(MyService service){
        this.service = service;
    }

    public void run(){
        service.methodA();
    }
}
