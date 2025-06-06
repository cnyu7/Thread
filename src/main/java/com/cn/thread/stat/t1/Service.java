package com.cn.thread.stat.t1;

public class Service {
    synchronized public static void printA() {
        try {
            System.out.println("线程名称为:" + Thread.currentThread().getName()
                    + "在" + System.currentTimeMillis() + "进入 printA");
            Thread.sleep(3000);
            System.out.println("线程名称为:" + Thread.currentThread().getName()
                    + "在" + System.currentTimeMillis() + " 离开 printA");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public static void printB() {
        System.out.println("线程名称为:" + Thread.currentThread().getName()
                + "在" + System.currentTimeMillis() + "进入printB");
        System.out.println("线程名称为:" + Thread.currentThread().getName()
                + "在" + System.currentTimeMillis() + "离开 printB");
    }
}
