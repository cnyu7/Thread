package com.cn.thread.t7;

public class CountOperate extends Thread{
    public CountOperate() {
            // 初始化子类，先初始化父类 super()
            super();
            System.out.println("CountOperate---begin");
            System.out.println("Thread.currentThread().getName()="
                    + Thread.currentThread().getName());
            System.out.println("Thread.currentThread().isAlive() ="
                    + Thread.currentThread().isAlive());
            System.out.println("this.getName () =" + this.getName());
            System.out.println("this.isAlive()=" + this.isAlive());
            System.out.println("CountOperate---end");
        }
        @Override
        public void run(){
            System.out.println("run---begin");
            //  Thread.currentThread() 当前执行线程。
            System.out.println("Thread.currentThread().getName () ="
                    + Thread.currentThread().getName());
            System.out.println("Thread.currentThread().isAlive()="
                    + Thread.currentThread().isAlive());
            // this 指的的Thread t1 = new Thread(c)的t1
            System.out.println("this.getName () =" + this.getName());
            System.out.println("this.isAlive()=" + this.isAlive());
            System.out.println("run---end");
        }

}
