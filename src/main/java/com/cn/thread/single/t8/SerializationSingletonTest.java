package com.cn.thread.single.t8;

import java.io.*;

public class SerializationSingletonTest {
    public static void main(String[] args) throws Exception {
        Singleton instance1 = Singleton.INSTANCE;

        // 序列化
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
        oos.writeObject(instance1);
        oos.close();

        // 反序列化
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("singleton.ser"));
        Singleton instance2 = (Singleton) ois.readObject();
        ois.close();

        // 比较两个实例是否相同
        System.out.println("instance1 == instance2: " + (instance1 == instance2));
    }
}

