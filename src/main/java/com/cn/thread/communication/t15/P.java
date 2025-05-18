package com.cn.thread.communication.t15;


import com.cn.thread.communication.t13.ValueObject;

public class P {
    private MyStack myStack;

    public P(MyStack myStack) {
        super();
        this.myStack = myStack;
    }

    public void pushService() {
       myStack.push();
    }
}
