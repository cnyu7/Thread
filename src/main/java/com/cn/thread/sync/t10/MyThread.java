package com.cn.thread.sync.t10;

public class MyThread extends Thread {

    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 5; i++) {
            System.out.println("i=" + (i + 1));
        }
    }
}
