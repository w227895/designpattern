package com.kebo.factorymethod;

/**
 * @description: 客户端测试
 * @Author: kb
 * @Date: 2019-07-30 17:23
 */
public class Client {
    public static void main(String[] args) {
        //new 方法获得对象
        /*LoggerFactory loggerFactory=new FileLoggerFactory();;
        Logger logger=loggerFactory.createLogger();
        logger.writeLog();*/

        /*//配置文件反射获得对象
        LoggerFactory factory=(LoggerFactory)XMLUtil.getBean();
        Logger logger=factory.createLogger();
        logger.writeLog();*/

        //从抽象类中获得
        LoggerFactory factory=(LoggerFactory)XMLUtil.getBean();
        factory.writeLog();
    }
}
