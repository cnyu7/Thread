package com.cn.thread.sync.t25;


public class Run {

    public static void main(String[] args) {
        ObjectService task = new ObjectService();
        ThreadA threadA = new ThreadA(task);
        threadA.start();
        ThreadB thread2 = new ThreadB(task);
        thread2.start();
    }
}
