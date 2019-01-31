package com.kebo.templatemethod;

/**
 * @ Author     ：kebo
 * @ Date       ：Created in 16:53 2019/1/27
 * @ Description：
 */
public class Main {
    public static void main(String[] args) {
        AbstractDisplay display1=new CharDisplay('H');
        AbstractDisplay display2=new StringDisplay("Hello,brother");
        AbstractDisplay display3=new StringDisplay("你好，小马哥");
        display1.display();
        display2.display();
        display3.display();

    }
}
