package com.kebo.adapter02;

/**
 * @ Author     ：kebo
 * @ Date       ：Created in 11:23 2019/1/27
 * @ Description：
 */
public class PrintBanner extends Print {
    private Banner banner;
    public PrintBanner(String string){
        this.banner=new Banner(string);
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
