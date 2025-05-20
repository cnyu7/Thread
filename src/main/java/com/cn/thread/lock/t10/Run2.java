package com.cn.thread.lock.t10;

public class Run2 {
    public static void main(String[] args) throws InterruptedException {
        final Service service = new Service();
        Runnable runnable = () -> service.serviceMethod3();
        Thread[] threadArray = new Thread[10];
        for (int i = 0; i < 10; i++) {
            threadArray[i] = new Thread(runnable);
        }
        for (int i = 0; i < 10; i++) {
            threadArray[i].start();
        }
        Thread.sleep(2000);
        System.out.println("有线程数: " + service.lock.getQueueLength() + "在等待获取锁!");
    }
}
