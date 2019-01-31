package com.kebo.templatemethod;

/**
 * @ Author     ：kebo
 * @ Date       ：Created in 16:46 2019/1/27
 * @ Description：
 */
public abstract class AbstractDisplay {
    public abstract void open();
    public abstract void print();
    public abstract void close();
    public final void display(){
        open();
        for (int i = 0; i <5 ; i++) {
            print();
        }
        close();
    }
}
