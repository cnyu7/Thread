package com.cn.thread.join.t1;

public class Test {
    public static void main(String[] args) throws InterruptedException {

        MyThread threadTest = new MyThread();
        threadTest.start();
        // Thread.sleep(?)
        // threadTest.join();
        System.out.println("我想当 threadTest 对象执行完毕后我再执行");
        System.out.println("但上面代码中的 sleep()中的值应该写多少呢?");
        System.out.println("答案是:根据不能确定:)");
    }
}
