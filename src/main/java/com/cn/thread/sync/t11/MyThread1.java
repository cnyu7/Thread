package com.cn.thread.sync.t11;

public class MyThread1 extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 500000; i++) {
            if (this.interrupted()) {
                System.out.println("已经是停止状态了!我要退出了!");
                break;
            }
            System.out.println("i=" + (i + 1));
        }
        System.out.println("我被输出,如果此代码是for 又继续运行,线程并未停止!");
    }
}
