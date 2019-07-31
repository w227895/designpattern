package com.kebo.factorymethod;

/**
 * @description: 文件日志记录工厂类
 * @Author: kb
 * @Date: 2019-07-30 17:22
 */
public class FileLoggerFactory extends LoggerFactory {
    @Override
    public Logger createLogger() {
        Logger logger=new FileLogger();
        return logger;
    }
}
