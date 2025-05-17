package com.cn.thread.sync.t4;

public class Run {

    public static void main(String[] args) {
        ALogin a = new ALogin();
        a.start();
        BLogin b = new BLogin();
        b.start();

    }
}
