package com.kebo.proxy;

import com.kebo.proxy.aop.IUserDao;
import com.kebo.proxy.aop.UserDao;

/**
 * @description: 代理模式
 * @Author: kb
 * @Date: 2020-07-31 14:21
 */
public class ProxyTest {
    public static void main(String[] args) {
        //RealSubject realSubject = new RealSubject();
        //realSubject.request();
       /* ProxySubject proxySubject = new ProxySubject();
        new ProxySubject().request();*/
        //proxySubject.request();

        UserDao userDao = new UserDao();

        ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler();
        proxyInvocationHandler.setTarget(userDao);
        IUserDao proxy = (IUserDao) proxyInvocationHandler.getProxy();
        proxy.find();
        proxy.save();

        RealSubject realSubject = new RealSubject();
        ProxyInvocationHandler proxyInvocationHandler1 = new ProxyInvocationHandler();
        proxyInvocationHandler1.setTarget(realSubject);
        Subject proxy1 = (Subject) proxyInvocationHandler1.getProxy();
        proxy1.request();
    }
}
