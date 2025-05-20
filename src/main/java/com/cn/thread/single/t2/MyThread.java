package com.cn.thread.single.t2;

public class MyThread extends Thread {
    public void run() {
        MyObject.getInstance4();
    }
}
