package com.kebo.strategy;

/**
 * @ Author     ：kebo
 * @ Date       ：Created in 14:49 2019/1/21
 * @ Description：测试程序
 */
public class TestDemo {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());//调用加法类
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubstract());//调用减法类
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());//调用乘法类
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}
