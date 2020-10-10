package com.kebo.singleton.type3;

/**
 * @description:
 * @author: kb
 * @create: 2020-10-09 22:31
 **/
public class SingletonTest03 {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2);
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
    }
}

//懒汉式（线程不安全）
class Singleton {
    private static Singleton instance;

    private Singleton() {

    }


    public  static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

