package com.cn.thread.t32;

public class MyObject {

    synchronized public void speedPrintString() {
        System.out.println("speedPrintString getLock time="
                + System.currentTimeMillis() + " run ThreadName="
                + Thread.currentThread().getName());
        System.out.println("---- -----");
        System.out.println("speedPrintString releaseLock time="
                + System.currentTimeMillis() + " run ThreadName="
                + Thread.currentThread().getName());
    }
}
