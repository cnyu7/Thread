package com.cn.thread.group.t7;

/**
 * 递归与非递归取得组内对象
 */
public class Run {

    public static void main(String[] args) {
        ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
        ThreadGroup groupA = new ThreadGroup(mainGroup, "A");
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("runMethod!");
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        ThreadGroup groupB = new ThreadGroup(groupA, "B");
        // 分配空间,但不一定全部用完
        ThreadGroup[] listGroup1 = new ThreadGroup[Thread.currentThread()
                .getThreadGroup().activeGroupCount()];
// 传入 true 是递归取得子组及子孙组
        Thread.currentThread().getThreadGroup().enumerate(listGroup1, true);
        for (int i = 0; i < listGroup1.length; i++) {
            if (listGroup1[i] != null) {
                System.out.println(listGroup1[i].getName());
            }
        }
        ThreadGroup[] listGroup2 = new ThreadGroup[Thread.currentThread()
                .getThreadGroup().activeGroupCount()];
        Thread.currentThread().getThreadGroup().enumerate(listGroup2, false);
        for (int i = 0; i < listGroup2.length; i++) {
            if (listGroup2[i] != null) {
                System.out.println(listGroup2[i].getName());
            }
        }
    }
}
