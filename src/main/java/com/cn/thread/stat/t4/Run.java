package com.cn.thread.stat.t4;

import com.cn.thread.stat.t2.Service;
import com.cn.thread.stat.t2.ThreadA;
import com.cn.thread.stat.t2.ThreadB;

public class Run {

    public static void main(String[] args) {
       Service service1 = new Service();
       Service service2 = new Service();
        ThreadA a = new ThreadA(service1);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(service2);
        b.setName("B");
        b.start();
    }
}
