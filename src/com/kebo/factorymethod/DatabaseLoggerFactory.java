package com.kebo.factorymethod;

/**
 * @description: 数据库日志记录工厂类
 * @Author: kb
 * @Date: 2019-07-30 17:20
 */
public class DatabaseLoggerFactory extends LoggerFactory {
    @Override
    public Logger createLogger() {
        Logger logger=new DatabaseLogger();
        return logger;
    }
}
