package com.kebo.strategy;

/**
 * @ Author     ：kebo
 * @ Date       ：Created in 14:47 2019/1/21
 * @ Description：实现接口
 */
public class OperationSubstract implements  Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1-num2;
    }
}
