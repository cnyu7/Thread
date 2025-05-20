package com.cn.thread.single.t1;

public class MyThread extends Thread {
    public void run() {
        System.out.println(MyObject.getInstance().hashCode());
    }
}
