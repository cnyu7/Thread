package com.cn.thread.communication.t12;

public class ThreadP extends Thread{
    private P p;
    public ThreadP(P p){
        super(); // 显示调用
        this.p = p;
    }

    @Override
    public void run() {
        while(true){
            p.setValue();
        }
    }
}
