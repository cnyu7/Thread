package com.cn.thread.sync.t7;

public class Run2 {

    public static void main(String[] args) {
            CountOperate c = new CountOperate();
            Thread t1 = new Thread(c);
            System.out.println("main begin t1 isAlive=" + t1.isAlive());
            t1.setName ("A");
            t1.start();
            System.out.println("main end t1 isAlive=" + t1.isAlive());
    }
}
