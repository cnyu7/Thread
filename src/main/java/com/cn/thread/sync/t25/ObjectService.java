package com.cn.thread.sync.t25;


/**
 * 在使用同步 synchronized(this) 代码块时需要注意的是,当一个线程访问 object 的一个
 * synchronized(this) 同步代码块时,其他线程对同一个 object 中所有其他 synchronized(this) 同
 * 步代码块的访问将被阻塞,这说明 synchronized 使用的“对象监视器”是一个。
 */
public class ObjectService {
    public void serviceMethodA() {
        try {
            synchronized (this) {
                System.out.println("A begin time=" + System.currentTimeMillis());
                Thread.sleep(2000);
                System.out.println("A end   end =" + System.currentTimeMillis());
            }
        }catch(InterruptedException e){
                e.printStackTrace();
            }
        }

    public void serviceMethodB() {
        synchronized (this) {
            System.out.println("B begin time=" + System.currentTimeMillis());
            System.out.println("B end    end=" + System.currentTimeMillis());

        }
    }
}

