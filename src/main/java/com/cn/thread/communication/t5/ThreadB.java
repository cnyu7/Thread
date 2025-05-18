package com.cn.thread.communication.t5;


public class ThreadB extends Thread {
    private MyList list;

    public ThreadB(MyList list) {
        super();
        this.list = list;
    }

    @Override
    public void run() {

        synchronized (list) {
            try {
                System.out.println("wait begin "
                        + System.currentTimeMillis());
                list.wait();
                System.out.println("wait end "
                        + System.currentTimeMillis());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


    }
}

