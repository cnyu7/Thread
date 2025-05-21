package com.cn.thread.date.t1;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyThread extends Thread {

    private SimpleDateFormat sdf;
    private String dateString;

    public MyThread(SimpleDateFormat sdf, String dateString) {
        super();
        this.sdf = sdf;
        this.dateString = dateString;
    }

    @Override
    public void run() {
        try {
            // 1.Date dateRef = sdf.parse(dateString);
            // 2.Date dateRef = DateTools.parse("yyyy-MM-dd",dateString);
            // 2.String newDateString = DateTools.format("yyyy-MM-dd",dateRef).toString();
            Date dateRef  = DateTools2.getSimpleDateFormat("yyyy-MM-dd").parse(dateString);
            String newDateString = DateTools2.getSimpleDateFormat("yyyy-MM-dd").format(dateRef);
            if (!newDateString.equals(dateString)) {
                System.out.println("ThreadName=" + this.getName()
                        + "报错了 日期字符串: " + dateString + " 转换成的日期为:"
                        + newDateString);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
