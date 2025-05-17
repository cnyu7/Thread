package com.cn.thread.sync.t17;

public class MyThread extends Thread{
    @Override
    public void run() {
        Service service = new Service();
        service.servicel();
    }
}
