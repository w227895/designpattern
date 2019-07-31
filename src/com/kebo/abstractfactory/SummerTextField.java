package com.kebo.abstractfactory;

/**
 * @description: Summer文本框类
 * @Author: kb
 * @Date: 2019-07-31 10:38
 */
public class SummerTextField implements TextField {
    @Override
    public void display() {
        System.out.println("显示蓝色边框文本框");
    }
}
