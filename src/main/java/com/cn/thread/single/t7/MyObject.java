package com.cn.thread.single.t7;

import java.io.Serializable;

public class MyObject implements Serializable {
    public enum MyEnumSingleton {
        INSTANCE;
        private MyObject myObject;

       private MyEnumSingleton() {
            myObject = new MyObject();
        }

        private MyObject getMyObject() {
            return myObject;
        }
    }

    private MyObject() {
    }

    public static MyObject getMyObject() {
        return MyEnumSingleton.INSTANCE.getMyObject();
    }
}
