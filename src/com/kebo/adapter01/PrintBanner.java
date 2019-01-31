package com.kebo.adapter01;

/**
 * @ Author     ：kebo
 * @ Date       ：Created in 11:23 2019/1/27
 * @ Description：
 */
public class PrintBanner extends Banner implements Print {
    public PrintBanner(String string){
        super(string);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
