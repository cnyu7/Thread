package com.cn.thread.threadlocal.t3;

public class ThreadLocalExt extends ThreadLocal{
    @Override
    protected Object initialValue () {
        return "我是默认值 第一次get 不再为 null";
    }
}
