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
            try {
                Thread.sleep(5000); // 模拟在创建对象之前做一些准备性的工作
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (MyObject.class) {
                if (myObject != null) {
                    System.out.println(Thread.currentThread().getName() +" 线程查看了 "+ myObject.hashCode());
                } else {
                    myObject = new MyObject();
                    System.out.println(Thread.currentThread().getName() +" 线程创建了 "+ myObject.hashCode());
                }
            }
        }
        return myObject;
    }

}
