package com.cn.thread.t20;


public class Test {
    public static void main(String[] args) throws InterruptedException {
        Sub subRef = new Sub ();
        ThreadA a = new ThreadA (subRef);
        a.setName ("A");
        a.start();
        ThreadB b = new ThreadB (subRef);
        b.setName ("B");
        b.start();
    }
}
