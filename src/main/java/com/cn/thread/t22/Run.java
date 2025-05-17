package com.cn.thread.t22;


public class Run {

    public static void main(String[] args) {
        ObjectService objectService = new ObjectService();
        ThreadA threadA = new ThreadA(objectService);
        threadA.start();
        ThreadB thread2 = new ThreadB(objectService);
        thread2.start();
    }
}
