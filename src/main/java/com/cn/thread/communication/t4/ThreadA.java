package com.cn.thread.communication.t4;


public class ThreadA extends Thread {
    private MyList list;

    public ThreadA(MyList list) {
        super();
        this.list = list;
    }
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                list.add();
                synchronized (list){
                    if (list.size() == 5) {
                        list.wait();
                    }
                }
                System.out.println("添加了" + (i + 1) + "个元素");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
