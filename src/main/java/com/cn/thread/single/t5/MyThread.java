package com.cn.thread.single.t5;

public class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++)
            System.out.println(Thread.currentThread().getName() + " " + MyObject.getInstance().hashCode());
    }
}
