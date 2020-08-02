package com.kebo.proxy;

/**
 * @description: 代理模式
 * @Author: kb
 * @Date: 2020-07-31 14:21
 */
public class ProxyTest {
    public static void main(String[] args) {
        //RealSubject realSubject = new RealSubject();
        //realSubject.request();
        ProxySubject proxySubject = new ProxySubject();
        new ProxySubject().request();
        //proxySubject.request();
    }
}
