package com.cn.thread.communication.t16;

public class BackupA extends Thread{
    private DBTools dbTools;

    public BackupA(DBTools dbTools) {
        this.dbTools = dbTools;
    }
    public void run() {
        dbTools.backupА();
    }

}
