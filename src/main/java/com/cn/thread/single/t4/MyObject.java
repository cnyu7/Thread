package com.cn.thread.single.t4;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class MyObject implements Serializable {
    // 内部类方式
    private static class MyObjectHandler {
        private static MyObject myObject = new MyObject();
    }

    private MyObject() {
    }

    public static MyObject getInstance() {
        return MyObjectHandler.myObject;
    }

    protected Object readResolve() throws ObjectStreamException {
        System.out.println("调用了 readResolve方法!");
        return MyObjectHandler.myObject;
    }
}
