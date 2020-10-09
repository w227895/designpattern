package com.kebo.singleton.type2;

/**
 * @description:
 * @author: kb
 * @create: 2020-10-09 22:31
 **/
public class SingletonTest01 {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2);
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
    }
}

//饿汉式（静态代码块）
//和静态变量方式基本没有太大差别
class Singleton {
    private static Singleton instance;

    private Singleton() {

    }

    static {
        instance = new Singleton();
    }

    public final static Singleton getInstance() {
        return instance;
    }
}

