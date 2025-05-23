package com.cn.thread.group.t4;

/**
 * 获取根线程组
 */
public class Run {
    public static void main(String[] args) {
        System.out.println("线程: " + Thread.currentThread().getName()
                + " 所在的线程组名为:" + Thread.currentThread().getThreadGroup().getName());
        System.out.println("main 线程所在的线程组的父线程组的名称是: "
                + Thread.currentThread().getThreadGroup().getParent()
                .getName());
        System.out.println("main 线程所在的线程组的父线程组的父线程组的名称是:"
                + Thread.currentThread().getThreadGroup().getParent().getParent().getName());
    }
}