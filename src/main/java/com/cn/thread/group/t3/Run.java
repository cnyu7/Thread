package com.cn.thread.group.t3;

/**
 * 自动归属就是自动归到当前线程组中。
 */
public class Run {
    public static void main(String[] args) {
        // 方法 activeGroupCount() 取得当前线程组对象中的子线程组数量
        // 方法 enumerate()的作用是将线程组中的子线程组以复制的形式
        // 拷贝到 ThreadGroup [〕数组对象中
        System.out.println("A处线程: " + Thread.currentThread().getName()
                + " 所属的线程组名为: "
                + Thread.currentThread().getThreadGroup().getName() + " "
                + " 中有线程组数量:"
                + Thread.currentThread().getThreadGroup().activeGroupCount());
        ThreadGroup group = new ThreadGroup("新的组 "); // 自动加到 main 组中
        System.out.println("B处线程: " + Thread.currentThread().getName()
                + " 所属的线程组名为: "
                + Thread.currentThread().getThreadGroup().getName() + " "
                + " 中有线程组数量: "
                + Thread.currentThread().getThreadGroup().activeGroupCount());
        ThreadGroup[] threadGroup = new ThreadGroup[Thread.currentThread()
                .getThreadGroup().activeGroupCount()];
        Thread.currentThread().getThreadGroup().enumerate(threadGroup);
        for (int i = 0; i < threadGroup.length; i++) {
            System.out.println("第一个线程组名称为: " + threadGroup[i].getName());
        }
    }
}
