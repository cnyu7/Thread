package com.cn.thread.t20;

import com.cn.thread.t19.Service;

public class ThreadA extends Thread {

    private Main main;

    public ThreadA(Main main) {
        super();
        this.main = main;
    }

    @Override
    public void run() {
        super.run();
        main.serviceMethod();
    }
}
