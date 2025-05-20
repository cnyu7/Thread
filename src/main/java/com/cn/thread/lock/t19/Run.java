package com.cn.thread.lock.t19;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();
        MyThreadA myThreadA = new MyThreadA(service);
        myThreadA.start();
    }
}
