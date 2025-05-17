package com.cn.thread.sync.t4;

public class BLogin extends Thread{

    @Override
    public void run () {
        LoginServlet.doPost ("b", "bb");
    }

}
