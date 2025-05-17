package com.cn.thread.t29;

public class MyThreadA extends Thread{
    private MyList myList;

    public MyThreadA(MyList myList) {
        this.myList = myList;
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            myList.add("threadA" + (i + 1));
        }
    }

}
