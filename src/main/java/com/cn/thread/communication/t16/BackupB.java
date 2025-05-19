package com.cn.thread.communication.t16;

public class BackupB extends Thread{
    private DBTools dbTools;

    public BackupB(DBTools dbTools) {
        this.dbTools = dbTools;
    }
    public void run() {
        dbTools.backupB();
    }

}
