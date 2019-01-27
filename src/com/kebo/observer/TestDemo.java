package com.kebo.observer;

import static com.kebo.observer.TestDemo.fun;

/**
 * @ Author     ：kebo
 * @ Date       ：Created in 12:26 2019/1/23
 * @ Description：
 */
public class TestDemo {
    public static void main(String[] args) {
Demo demo=new Demo("Hello");
fun(demo);
        System.out.println(demo.getData());
    }
    public  static void fun(Demo temp){
    temp.setData("kebo");
    }

}
class Demo{
    private String data;

    public Demo(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}