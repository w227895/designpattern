package com.kebo.singleton.type1;

/**
 * @description:
 * @author: kb
 * @create: 2020-10-09 22:31
 **/
public class SingletonTest01 {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1==singleton2);
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
    }
}

//饿汉式（静态变量）
//优点：写法简单，在类装载的时候就完成了初始化，避免了线程同步问题
//缺点：在类装载的时候就完成了初始化，没有达到延迟加载的效果。
// 如果从开始到结束都从未使用这个实例，就会造成内存的浪费
class Singleton {
    private Singleton() {

    }

    private final static Singleton instance = new Singleton();

    public  static Singleton getInstance() {
        return instance;
    }
}

