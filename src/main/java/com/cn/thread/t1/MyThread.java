package com.cn.thread.t1;

public class MyThread extends Thread{


    @Override
    public void run() {
        super.run();
        System.out.println("MyThread");
    }
}
