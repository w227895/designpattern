package com.kebo.singleton.type4;

/**
 * @description:
 * @author: kb
 * @create: 2020-10-09 22:31
 **/
public class SingletonTest04 {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2);
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
    }
}

//懒汉式（线程安全，同步方法）
class Singleton {
    private static Singleton instance;

    private Singleton() {

    }


    public synchronized static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}


