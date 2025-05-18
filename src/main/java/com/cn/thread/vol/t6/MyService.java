package com.cn.thread.vol.t6;

import java.util.concurrent.atomic.AtomicLong;

public class MyService {
    public static AtomicLong aiRef = new AtomicLong();

    // 过程打印出错，结果仍然正确
      public void addNum() {
        System.out.println(Thread.currentThread().getName() + "加了100之后的值是:"
                + aiRef.addAndGet(100));
        aiRef.addAndGet(1);
    }
}
