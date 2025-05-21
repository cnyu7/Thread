package com.cn.thread.single.t8;

public enum Singleton {
    INSTANCE;

    // 可以添加其他需要的业务方法
    public void doSomething() {
        System.out.println("Singleton using Enum!");
}
}
