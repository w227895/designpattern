package com.kebo.abstractfactory;

/**
 * @description: 界面皮肤接口，充当抽象工厂
 * @Author: kb
 * @Date: 2019-07-31 10:39
 */
public interface SkinFactory {
    public Button createButton();
    public TextField createTextField();
}
