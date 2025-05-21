package com.cn.thread.single.t9;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class MyTest3 {
    public static void main(String[] args) throws Exception{
//通过反射获取
        Class<? extends Singleton3> aClass = Singleton3.class;
        //注意：构造方法是私有的
        Constructor<? extends Singleton3> declaredConstructor = aClass.getDeclaredConstructor(null);
        declaredConstructor.setAccessible(true);
        Singleton3 instance01 = declaredConstructor.newInstance();
        //获取字段名
        Field flag = aClass.getDeclaredField("flag");
        flag.setAccessible(true);
        //获取之后复位 认为又是第一次
        // flag.set(instance01,false);
        System.out.println(flag.get(instance01));
        Singleton3 instance02 = declaredConstructor.newInstance();
        System.out.println(instance01);
        System.out.println(instance02);
    }
}

