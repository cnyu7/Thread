package com.cn.thread.single.t6;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public enum MyObject {
    connectionFactory;
    private Connection connection;

    MyObject() {
        try {
            System.out.println("调用了 MyObject 的构造");
            String url = "jdbc:sqlserver://localhost:1079; databaseName=ghydb";
            String username = "sa";
            String password = "";
            String driverName = "com.mysql.cj.jdbc.Driver";
            Class.forName(driverName);
            connection = new MyConnection();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }
}
