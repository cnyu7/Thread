package com.cn.thread.sync.t32;



public class ThreadB extends Thread{

    private MyObject myObject;

    public ThreadB(MyObject myObject) {
        this.myObject = myObject;
    }

    public void run() {
        myObject.speedPrintString();
    }
}
