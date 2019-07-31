package com.kebo.abstractfactory;

/**
 * @description: Spring按钮类
 * @Author: kb
 * @Date: 2019-07-31 10:33
 */
public class SpringButton implements Button {
    @Override
    public void dispaly() {
        System.out.println("显示绿色按钮");
    }
}
