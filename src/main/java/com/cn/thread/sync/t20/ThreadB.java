package com.cn.thread.sync.t20;

public class ThreadB extends Thread {

    private Main main;

    public ThreadB(Main main) {
        super();
        this.main = main;
    }

    @Override
    public void run() {
        super.run();
        main.serviceMethod();
    }
}
