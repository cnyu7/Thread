package com.cn.thread.lock.t17;

public class Run {
    public static void main(String[] args) throws InterruptedException {
//        final MyService service = new MyService();
        final MyService2 service = new MyService2();
        Runnable runnableRef = () -> {
            System.out.println(Thread.currentThread().getName() +"调用waitMethod的时间："+ System.currentTimeMillis());
            service.waitMethod();
        };
        Thread threadA = new Thread(runnableRef);
        threadA.setName("A");
        threadA.start();
        Thread threadB = new Thread(runnableRef);
        threadB.setName("B");
        threadB.start();
    }
}
