package com.cn.thread.sync.t8;

public class Run1 {
    public static void main(String[] args) {
        MyThread1 mythread = new MyThread1();
        System.out.println("begin =" + System.currentTimeMillis());
            mythread.run();
//        mythread.start();
        System.out.println("end =" + System.currentTimeMillis());

    }
}
