package com.kebo.templatemethod;

/**
 * @ Author     ：kebo
 * @ Date       ：Created in 16:48 2019/1/27
 * @ Description：
 */
public class CharDisplay extends AbstractDisplay {
    private char ch;
    public CharDisplay(char ch){
        this.ch=ch;
    }
    @Override
    public void open() {
        System.out.println("<<");
    }

    @Override
    public void print() {
        System.out.println(ch);
    }

    @Override
    public void close() {
        System.out.println(">>");
    }
}