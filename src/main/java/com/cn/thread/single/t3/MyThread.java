package com.cn.thread.single.t3;


public class MyThread extends Thread {
    public void run() {
        System.out.println(MyObject.getInstance().hashCode());
    }
}
