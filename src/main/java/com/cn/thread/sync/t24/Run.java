package com.cn.thread.sync.t24;

public class Run {

    public static void main(String[] args) {
        Task task = new Task();
        ThreadA threadA = new ThreadA(task);
        threadA.start();
        ThreadB thread2 = new ThreadB(task);
        thread2.start();
    }
}
