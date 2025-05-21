package com.cn.thread.date.t1;

import java.text.SimpleDateFormat;

public class DateTools2 {
    private static ThreadLocal<SimpleDateFormat> t1 = new ThreadLocal<>();

    public static SimpleDateFormat getSimpleDateFormat(String datePattern) {
        SimpleDateFormat sdf = null;
        sdf = t1.get();
        if (sdf == null) {
            sdf = new SimpleDateFormat(datePattern);
            t1.set(sdf);
        }
        return sdf;
    }
}
