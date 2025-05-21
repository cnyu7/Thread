package com.cn.thread.exception.t3;


public class MyThread extends Thread {

    private String num;

    public MyThread(ThreadGroup group, String name, String num) {
        super(group, name);
        this.num = num;
    }

    @Override
    public void run() {
        try {
            int numInt = Integer.parseInt(num);
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
        while (this.isInterrupted() == false) {
            System.out.println(Thread.currentThread().getName() + " "+this.isInterrupted());
            System.out.println("死循环中:" + Thread.currentThread().getName());

        }

    }
}
