package com.cn.thread.group.t6;

/**
 * 组内的线程批量停止
 */
public class Run {

    public static void main(String[] args) {
        try {
            ThreadGroup group = new ThreadGroup(" 我的线程组");
            for (int i = 0; i < 5; i++) {
                MyThread thread = new MyThread(group, "线程" + (i + 1));
                thread.start();
            }
            Thread.sleep(5000);
            System.out.println("调用了 interrupt()方法");
            group.interrupt();
        } catch (InterruptedException e) {
            System.out.println("停了停了!");
            e.printStackTrace();
        }
    }
}
