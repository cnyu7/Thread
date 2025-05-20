package com.cn.thread.single.t5;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class MyObject implements Serializable {
    private static MyObject myObject = null;


    private MyObject() {
    }

    static {
        System.out.println(Thread.currentThread().getName());
        myObject = new MyObject();
    }

    public static MyObject getInstance() {
        return myObject;
    }

}
