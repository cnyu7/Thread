package com.cn.thread.single.t9;


/**
 * 只有在thread1的执行顺序为：
 * x=b;
 * a=1;
 * 且thread2的执行顺序为：
 * y=a,
 * b=1;
 * 时才会出现x=0且y=0的结果
 * @Description 指令乱排证明实力 出现0,0则说明有乱排现象。
 */
public class Disorder {
      private static int x = 0, y = 0, a = 0, b =0;

    public static void main(String[] args) throws InterruptedException {
        int i = 0;
        while(true) {
            i++;
            x = 0; y = 0; a = 0; b = 0;
            Thread t1 = new Thread(() -> {
                //由于线程t1先启动，可以根据自己电脑性能调整等待时间，让它等一等线程t2.
                //shortWait(100000);
                a = 1;
                x = b;
            });

            Thread t2 = new Thread(() -> {
                b = 1;
                y = a;
            });

            t1.start();
            t2.start();
            t1.join();
            t2.join();

            if(x == 0 && y == 0) {
                System.out.printf("第%d次（%d, %d）\n", i, x, y);
                break;
            }
        }
    }
}

