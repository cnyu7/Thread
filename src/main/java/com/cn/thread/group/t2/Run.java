package com.cn.thread.group.t2;

/**
 * 线程对象关联线程组:多级关联
 */
public class Run {
    public static void main(String[] args) {

        // 在 main 组中添加一个线程组A,然后在这个A组中添加线程对象乙
        // 方法 activeGroupCount()和 activeCount()的值不是固定的
        // 是系统中环境的一个快照
        ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
        ThreadGroup group = new ThreadGroup(mainGroup, "A");
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("runMethod!");
                    Thread.sleep(10000);// 线程必须在运行状态才可以受组管理
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread newThread = new Thread(group, runnable);
        newThread.setName("Z");
        newThread.start(); // 线程必须启动然后才归到组A中
        ThreadGroup[] listGroup = new ThreadGroup[Thread.currentThread()
                .getThreadGroup().activeGroupCount()];
        Thread.currentThread().getThreadGroup().enumerate(listGroup);
        System.out.println("main 线程中有多少个子线程组:" + listGroup.length + " 名字为:"
                + listGroup[0].getName());
        Thread[] listThread = new Thread[listGroup[0].activeCount()];
        listGroup[0].enumerate(listThread);
        System.out.println(listThread[0].getName());
    }
}
