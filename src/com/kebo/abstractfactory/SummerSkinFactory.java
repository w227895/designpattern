package com.kebo.abstractfactory;

/**
 * @description: Summer皮肤工厂，充当具体工厂
 * @Author: kb
 * @Date: 2019-07-31 10:42
 */
public class SummerSkinFactory implements  SkinFactory {
    @Override
    public Button createButton() {
        return new SummerButton();
    }

    @Override
    public TextField createTextField() {
        return new SummerTextField();
    }
}
