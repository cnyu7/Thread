package com.cn.thread.sync.t13;

public class ThreadB extends Thread{

    private HasSelfPrivateNum numRef;
    public ThreadB(HasSelfPrivateNum numRef) {
        super();
        this.numRef = numRef;
    }
        @Override
        public void run () {
            super.run();
            numRef.addI("b");
        }
}
