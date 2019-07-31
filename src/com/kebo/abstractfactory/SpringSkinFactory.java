package com.kebo.abstractfactory;

/**
 * @description: Spring皮肤工厂，充当具体工厂
 * @Author: kb
 * @Date: 2019-07-31 10:40
 */
public class SpringSkinFactory implements SkinFactory {

    @Override
    public Button createButton() {
        return new SpringButton();
    }

    @Override
    public TextField createTextField() {
        return new SpringTextField();
    }
}
