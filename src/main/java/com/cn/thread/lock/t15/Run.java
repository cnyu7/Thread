package com.cn.thread.lock.t15;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        final Service service = new Service(true);
        Runnable runnable = () -> service.serviceMethod();
        Thread thread = new Thread(runnable);
        thread.start();
        System.out.println("当前线程："+Thread.currentThread().getName() + " "+service.lock.isHeldByCurrentThread());
    }
}
