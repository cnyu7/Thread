package com.cn.thread.communication.t5;


public class ThreadA extends Thread {
    private MyList list;

    public ThreadA(MyList list) {
        super();
        this.list = list;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            list.add();
            if (list.size() == 5) {
            synchronized (list){
                    list.notify();
                }
            }
            System.out.println("添加了" + (i + 1) + "个元素");
        }
    }
}
