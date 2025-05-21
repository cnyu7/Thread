package com.cn.thread.single.t9;

import java.lang.reflect.Constructor;

public class MyTest {
    public static void main(String[] args) throws Exception{
        //正常获取
        Singleton instance = Singleton.newInstance();
        //通过反射获取
        Class<? extends Singleton> aClass = instance.getClass();
        //注意：构造方法是私有的
        Constructor<? extends Singleton> declaredConstructor = aClass.getDeclaredConstructor(null);
        declaredConstructor.setAccessible(true);
        Singleton instance02 = declaredConstructor.newInstance();
        System.out.println(instance);
        System.out.println(instance02);
    }
}

