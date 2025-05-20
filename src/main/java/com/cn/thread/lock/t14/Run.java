package com.cn.thread.lock.t14;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        final Service servicel = new Service(true);
        Runnable runnable = () -> servicel.serviceMethod();
        Thread thread = new Thread(runnable);
        thread.start();
        final Service service2 = new Service(false);
        runnable = () -> service2.serviceMethod();
        thread = new Thread(runnable);
        thread.start();
    }
}
