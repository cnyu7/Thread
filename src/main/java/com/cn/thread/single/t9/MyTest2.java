package com.cn.thread.single.t9;

import java.lang.reflect.Constructor;

/**
 * 反射他不走正常渠道方法Singleton2.newInstance
 */
public class MyTest2 {
    public static void main(String[] args) throws Exception{
        Class<? extends Singleton2> aClass = Singleton2.class;
        //注意：构造方法是私有的
        Constructor<? extends Singleton2> declaredConstructor = aClass.getDeclaredConstructor(null);
        declaredConstructor.setAccessible(true);
        Singleton2 instance01 = declaredConstructor.newInstance();
        Singleton2 instance02 = declaredConstructor.newInstance();
        System.out.println(instance01);
        System.out.println(instance02);
    }
}

