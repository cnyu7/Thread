package com.cn.thread.vol.t7;

public class Run {
    public static void main(String[] args) {
        try {
            Service service = new Service();
            ThreadA a = new ThreadA(service);
            a.start();
            Thread.sleep(1000);
            ThreadB b = new ThreadB(service);
            b.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
