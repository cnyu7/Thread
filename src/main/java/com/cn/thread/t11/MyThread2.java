package com.cn.thread.t11;

public class MyThread2 extends Thread {
    @Override
    public void run() {
        super.run();
        try {
            for (int i = 0; i < 500000; i++) {
                if (this.interrupted()) {
                    System.out.println("已经是停止状态了!我要退出了!");
                    throw new InterruptedException();
                }
                System.out.println("i=" + (i + 1));
            }
            System.out.println("我被输出,如果此代码是for 又继续运行,线程并未停止!");
        } catch (Exception e) {
                System.out.println("进 MyThread.java 类 run 方法中的catch了! ");
            throw new RuntimeException(e);
        }
        System.out.println("end!");
    }
}
