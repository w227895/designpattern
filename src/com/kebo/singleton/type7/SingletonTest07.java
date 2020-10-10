package com.kebo.singleton.type7;

/**
 * @description:
 * @author: kb
 * @create: 2020-10-09 22:31
 **/
public class SingletonTest07 {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2);
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
    }
}

//静态内容类完成
//好处：1.加载Singleton不会加载静态内部类，这样完成了懒加载
//2.在实际调用getInstance方法时，jvm底层加载类是线程安全的，所以也拥有线程安全的能力
class Singleton {

    private Singleton() {

    }

    private static class SingletonInstance{
        private final static Singleton INSTANCE=new Singleton();
    }

    public  static Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }
}

