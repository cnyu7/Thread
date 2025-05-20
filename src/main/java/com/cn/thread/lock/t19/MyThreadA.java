package com.cn.thread.lock.t19;

import com.cn.thread.sync.t29.MyThreadB;

public class MyThreadA extends Thread {
    private Service service;

    public MyThreadA(Service service) {
        this.service = service;
    }

    public void run() {
        service.waitMethod();
    }

}
