package com.kebo.proxy;

/**
 * @description:
 * @Author: kb
 * @Date: 2020-07-31 14:22
 */
public class RealSubject implements Subject{

    public RealSubject() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void request() {
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println("实现了真实的方法");
    }
}
