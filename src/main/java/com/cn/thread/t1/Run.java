package com.cn.thread.t1;

public class Run {


    /**
     * read.java 类中的 run 方法执行的时间比较晚,这也说明在使用多线程技术时,
     *         代码的运行结果与代码执行顺序或调用顺序是无关的。
     *         线程是一个子任务,CPU 以不确定的方式,或者说是以随机的时间来调用线程中的 run方法，
     *         所以就会出现先打印“运行结束!”后输出“MyThread”这样的结果了。
     * @param args
     */
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        myThread.start();
        System.out.println("运行结束");
    }


}
