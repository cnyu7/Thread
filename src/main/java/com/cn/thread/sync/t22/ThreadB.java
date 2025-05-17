package com.cn.thread.sync.t22;

public class ThreadB extends Thread {

    private ObjectService objectService;

    public ThreadB(ObjectService objectService) {
        super();
        this.objectService = objectService;
    }

    @Override
    public void run() {
        super.run();
        objectService.serviceMethod();
    }
}
