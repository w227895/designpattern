package com.kebo.singleton.type9;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: kb
 * @create: 2020-10-10 21:42
 **/
public class Singleton {

    // 存储需要进行维护和管理的类的实例
    private static Map<String, Singleton> map = new HashMap<String, Singleton>();

    /**
     * 静态创建实例并添加到Map集合
     */
    static {
        Singleton singleton = new Singleton();
        map.put(singleton.getClass().getName(), singleton);
    }

    /**
     * 该函数限制用户主动创建实例
     */
    private Singleton() {};

    /**
     * 获取Singleton实例，也叫静态工厂方法
     * @return Singleton
     */
    public static Singleton getInstance(String name) {
		/* 根据指定的类的名称从mao中获取实例并返回 */
        return map.get(name);
    }

    // 一个示例性的商业方法
    public String about() {
        return "你好,我是RegSingleton";
    }

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance("com.kebo.singleton.type9.Singleton");
        System.out.println(singleton.about());
    }

}

