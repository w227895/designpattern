package com.kebo.factorymethod;

/**
 * @description: 模拟文件日志
 * @Author: kb
 * @Date: 2019-07-30 17:18
 */
public class FileLogger implements Logger{

    @Override
    public void writeLog() {
        System.out.println("文件日志记录");
    }
}
