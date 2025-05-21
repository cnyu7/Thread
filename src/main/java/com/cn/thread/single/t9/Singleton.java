package com.cn.thread.single.t9;

/**
 * 懒汉模式(懒加载)
 */
public class Singleton {

    private Singleton() {
    }

    //2 创建一个private对象
    private static Singleton INSTANCE;

    //3 提供一个static方法来获取你的这个单实例对象
    //方案1：方法锁,里面还有业务逻辑
    //public static synchronized  Singleton02 newInstance(){
    public static Singleton newInstance() {
        //方案2：锁代码块
        //synchronized (Singleton02.class){ // 100个线程哪怕有一个已经创建了也要排队
        if (INSTANCE == null) {
            //多线程来了？ T1 T2
            synchronized (Singleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Singleton();
                }
            }
        }
        //}

        //此处有10W行代码....
        return INSTANCE;
    }

    //普通方法
    public String getConnection() {
        return "I am connection!";
    }
}
