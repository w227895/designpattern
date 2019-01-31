package com.kebo.adapter01;

/**
 * @ Author     ：kebo
 * @ Date       ：Created in 11:18 2019/1/27
 * @ Description：
 */
public class Banner {
    private String string;

    public Banner(String string) {
        this.string = string;
    }
    public void showWithParen(){
        System.out.println("("+string+")");
    }
    public void showWithAster(){
        System.out.println("*"+string+"*");
    }
}
