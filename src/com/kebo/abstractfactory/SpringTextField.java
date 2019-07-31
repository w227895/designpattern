package com.kebo.abstractfactory;

/**
 * @description: Spring文本框类
 * @Author: kb
 * @Date: 2019-07-31 10:37
 */
public class SpringTextField implements TextField {
    @Override
    public void display() {
        System.out.println("显示绿色边框文本框");
    }
}
