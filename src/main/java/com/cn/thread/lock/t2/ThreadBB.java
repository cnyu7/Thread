package com.cn.thread.lock.t2;

public class ThreadBB extends Thread{
    private MyService service;

    public ThreadBB(MyService service){
        this.service = service;
    }

    public void run(){
        service.methodB();
    }
}
