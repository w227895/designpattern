package com.kebo.singleton.type6;

/**
 * @description:
 * @author: kb
 * @create: 2020-10-09 22:31
 **/
public class SingletonTest06 {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2);
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
    }
}

//懒汉式（线程安全，双重检查）
class Singleton {
    private volatile static Singleton instance;

    private Singleton() {

    }


    public static Singleton getInstance() {
        if (instance == null) {
            //这种方式其实是线程不安全的，有大问题
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}

