package com.cn.thread.t33;


public class ThreadB extends Thread{

    private MyObject myObject;

    public ThreadB(MyObject myObject) {
        this.myObject = myObject;
    }

    public void run() {
        myObject.speedPrintString();
    }
}
