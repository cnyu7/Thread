package com.cn.thread.t28;



public class MyThread1 extends Thread{

    private Service service;
    public MyThread1 (Service service) {
        super();
        this.service = service;
    }
        @Override
        public void run () {
            super.run();
            service.a();
        }
}
