package com.cn.thread.communication.t13;


public class ThreadC extends Thread{
    private C c;
    public ThreadC(C c){
        super(); // 显示调用
        this.c = c;
    }

    @Override
    public void run() {
        while(true){
            c.getValue();
        }
    }
}
