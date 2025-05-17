package com.cn.thread.sync.t27;


public class MyThread2 extends Thread{

    private Service service;
    public MyThread2(Service service) {
        super();
        this.service = service;
    }
        @Override
        public void run () {
            super.run();
            service.setUsernamePassword("b","bb");
        }
}
