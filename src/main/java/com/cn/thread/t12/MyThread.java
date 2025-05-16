package com.cn.thread.t12;

public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        try {
            System.out.println("run begin");
//            Thread.sleep(200000);
            System.out.println("run end");
            System.out.println(this.isInterrupted());
        } catch (Exception e) {
            System.out.println("在沉睡中被停止!进入 catch!" + this.isInterrupted());
            e.printStackTrace();
        }

    }
}
