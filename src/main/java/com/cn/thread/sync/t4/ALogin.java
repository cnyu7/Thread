package com.cn.thread.sync.t4;

public class ALogin extends Thread{

    @Override
    public void run () {
        LoginServlet.doPost ("a", "aa");
    }

}
