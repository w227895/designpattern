package com.kebo.factorymethod;

public abstract class LoggerFactory{
    public void writeLog(){
        Logger logger=this.createLogger();
        logger.writeLog();
    }

    public abstract Logger createLogger();

}

/*public interface LoggerFactory {

    public Logger createLogger();//抽象工厂方法
}*/
