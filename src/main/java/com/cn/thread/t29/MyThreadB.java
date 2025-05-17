package com.cn.thread.t29;

public class MyThreadB extends Thread{
    private MyList myList;

    public MyThreadB(MyList myList) {
        this.myList = myList;
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            myList.add("threadB" + (i + 1));
        }
    }

}
