package com.kebo.strategy;

/**
 * @ Author     ：kebo
 * @ Date       ：Created in 14:49 2019/1/21
 * @ Description：创建Context类
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }
}
