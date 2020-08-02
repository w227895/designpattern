package com.kebo.proxy;

/**
 * @description:
 * @Author: kb
 * @Date: 2020-07-31 14:25
 */
public class ProxySubject implements Subject {
    private RealSubject realSubject;

    /*public ProxySubject(RealSubject realSubject) {
        this.realSubject=realSubject;
    }*/

    @Override
    public void request() {
        if (realSubject==null)
        {
            realSubject=new RealSubject();
        }
        before();
        realSubject.request();
        after();
    }

    private void before() {
        System.out.println("执行方法之前");
    }

    private void after() {
        System.out.println("执行方法之后");
    }
}
