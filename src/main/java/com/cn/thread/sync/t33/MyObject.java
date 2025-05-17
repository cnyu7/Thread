package com.cn.thread.sync.t33;

public class MyObject {

    public void speedPrintString() {
        synchronized (this) {
            System.out.println("speedPrintString getLock time="
                    + System.currentTimeMillis() + " run ThreadName="
                    + Thread.currentThread().getName());
            System.out.println("---- -----");
            System.out.println("speedPrintString releaseLock time="
                    + System.currentTimeMillis() + " run ThreadName="
                    + Thread.currentThread().getName());
        }
    }
}
