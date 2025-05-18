package com.cn.thread.communication.t11;

public class Run {
    public static void main(String[] args) throws InterruptedException {

        String lock = new String("");
        Add add = new Add(lock);
        Subtract subtract = new Subtract(lock);
        ThreadSub subtract1Thread = new ThreadSub(subtract);
        subtract1Thread.setName("subtract1Thread");
        subtract1Thread.start();
        ThreadSub subtract2Thread = new ThreadSub(subtract);
        subtract2Thread.setName("subtract2Thread");
        subtract2Thread.start();
        Thread.sleep(1000);
        ThreadAdd addThread = new ThreadAdd(add);
        addThread.setName("addThread");
        addThread.start();
    }
}
