package com.cn.thread.t24;


import com.cn.thread.t22.ObjectService;

public class ThreadA extends Thread {

    private Task task;

    public ThreadA(Task task) {
        super();
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        task.doLongTimeTask();
    }
}
