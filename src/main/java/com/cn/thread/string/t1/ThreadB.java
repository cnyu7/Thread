package com.cn.thread.string.t1;



public class ThreadB extends Thread{

    private Service service;

    public ThreadB(Service service) {
        this.service = service;
    }
    @Override
    public void run () {
        service.print(Integer.valueOf(129));
    }
}
