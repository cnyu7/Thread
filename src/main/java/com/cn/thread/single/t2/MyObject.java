package com.cn.thread.single.t2;

public class MyObject {
    // 延迟加载方式==懒汉模式
    private static MyObject myObject = null;

    private MyObject() {
    }

    synchronized public static MyObject getInstance() {
        // 延迟加载
        if (myObject != null) {
            System.out.println(Thread.currentThread().getName() +" 线程查看了 "+ myObject.hashCode());
        } else {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            myObject = new MyObject();
            System.out.println(Thread.currentThread().getName() +" 线程创建了 "+ myObject.hashCode());
        }
        return myObject;
    }

    public static MyObject getInstance2() {
        // 延迟加载
        synchronized (MyObject.class) {
            if (myObject != null) {
                System.out.println(Thread.currentThread().getName() +" 线程查看了 "+ myObject.hashCode());
            } else {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                myObject = new MyObject();
                System.out.println(Thread.currentThread().getName() +" 线程创建了 "+ myObject.hashCode());
            }
        }
        return myObject;
    }

    public static MyObject getInstance3() {
        // 延迟加载
        if (myObject != null) {
            System.out.println(Thread.currentThread().getName() +" 线程查看了 "+ myObject.hashCode());
        } else {
            try {
                Thread.sleep(5000); // 模拟在创建对象之前做一些准备性的工作
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (MyObject.class) {
                myObject = new MyObject();
                System.out.println(Thread.currentThread().getName() +" 线程创建了 "+ myObject.hashCode());
            }
        }
        return myObject;
    }
    public static MyObject getInstance4() {
        // 延迟加载
        if (myObject != null) {
        } else {
            synchronized (MyObject.class) {
                if (myObject != null) {
                    System.out.println(Thread.currentThread().getName() +" 线程查看了 "+ myObject.hashCode());
                } else {
                    try {
                        Thread.sleep(5000); // 模拟在创建对象之前做一些准备性的工作
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    // 对象初始化分为三步：
                    // 1. 分配内存空间
                    // 2. 初始化对象
                    // 3. 设置引用指向内存地址
                    // volatile防止步骤2和3重排序
                    myObject = new MyObject();

                    System.out.println(Thread.currentThread().getName() +" 线程创建了 "+ myObject.hashCode());
                }
            }
        }
        return myObject;
    }

}
