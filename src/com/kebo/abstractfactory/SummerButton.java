package com.kebo.abstractfactory;

/**
 * @description: Summer按钮类
 * @Author: kb
 * @Date: 2019-07-31 10:35
 */
public class SummerButton implements Button {
    @Override
    public void dispaly() {
        System.out.println("显示浅蓝色按钮类");
    }
}
