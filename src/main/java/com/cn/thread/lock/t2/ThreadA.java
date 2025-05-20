package com.cn.thread.lock.t2;

public class ThreadA extends Thread{
    private MyService service;

    public ThreadA(MyService service){
        this.service = service;
    }

    public void run(){
        service.methodA();
    }
}
