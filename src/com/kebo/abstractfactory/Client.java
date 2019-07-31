package com.kebo.abstractfactory;

/**
 * @description: 抽象工厂模式
 * @Author: kb
 * @Date: 2019-07-31 10:44
 */
public class Client {
    public static void main(String[] args) {
        SkinFactory skinFactory=(SkinFactory)XMLUtil.getBean();
        Button button=skinFactory.createButton();
        TextField textField=skinFactory.createTextField();
        button.dispaly();
        textField.display();
    }
}
