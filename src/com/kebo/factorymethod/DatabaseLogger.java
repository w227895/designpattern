package com.kebo.factorymethod;

/**
 * @description: 模拟数据库日志
 * @Author: kb
 * @Date: 2019-07-30 17:16
 */
public class DatabaseLogger implements  Logger{

    @Override
    public void writeLog() {
        System.out.println("数据库日志记录");
    }
}
