package com.cn.thread.t31;

/**
 * 1)当多个线程同时执行 synchronized(x){} 同步代码块时呈同步效果。
 * 2)当其他线程执行x对象中 synchronized 同步方法时呈同步效果。
 * 3)当其他线程执行x对象方法里面的 synchronized(this) 代码块时也呈现同步效果。
 */
public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        MyObject object = new MyObject();
        ThreadA a = new ThreadA(service, object);
        a.setName("a");
        a.start();
        ThreadB b = new ThreadB(service, object);
        b.setName("b");
        b.start();

    }
}