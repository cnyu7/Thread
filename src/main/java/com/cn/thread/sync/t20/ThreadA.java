package com.cn.thread.sync.t20;

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
