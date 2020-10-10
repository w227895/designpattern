package com.kebo.singleton.type8;

/**
 * @description:
 * @author: kb
 * @create: 2020-10-09 22:31
 **/
public class SingletonTest08 {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.INSTANCE;
        Singleton singleton2 = Singleton.INSTANCE;
        System.out.println(singleton1==singleton2);
    }
}

//使用枚举也可以实现单例
enum Singleton{
    INSTANCE;
    public void sayOk(){
        System.out.println("ok");
    }
}


