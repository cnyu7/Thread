package com.cn.thread.date.t1;

import java.text.SimpleDateFormat;

/**
 * 1.创建了多个 SimpleDateFormat
 * 2.ThreadLocal 类能使线程绑定到指定的对象。
 */
public class Test {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String[] dateStringArray = new String[]{"2000-01-01", "2000-01-02",
                "2000-01-03", "2000-01-04", "2000-01-05", "2000-01-06",
                "2000-01-07", "2000-01-08", "2000-01-09", "2000-01-10" };
        MyThread[] threadArray = new MyThread[10];
        for (int i = 0; i < 10; i++) {
            threadArray[i] = new MyThread(sdf, dateStringArray[i]);
        }
        for (int i = 0; i < 10; i++) {
            threadArray[i].start();
        }
    }
}
