package com.cn.thread.communication.t4;


public class ThreadB extends Thread {
    private MyList list;

    public ThreadB(MyList list) {
        super();
        this.list = list;
    }

    @Override
    public void run() {
        synchronized (list) {
            if (list.size() == 5) {
                list.notify();
                System.out.println("==5了,线程b要退出了!");
            }
        }
    }
}
