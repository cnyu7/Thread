package com.cn.thread.single.t8;

import java.lang.reflect.Constructor;

public class ReflectionSingletonTest {
    public static void main(String[] args) {
        try {
            Singleton instance1 = Singleton.INSTANCE;

            // 通过反射获取枚举类的构造方法
            Constructor<?>[] constructors = Singleton.class.getDeclaredConstructors();
            for (Constructor<?> constructor : constructors) {
                constructor.setAccessible(true);
                Singleton instance2 = (Singleton) constructor.newInstance();
                System.out.println("instance1 == instance2: " + (instance1 == instance2));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

