package com.kebo.simplefactory;

/**
 * @ Author     ：kebo
 * @ Date       ：Created in 16:16 2019/2/1
 * @ Description：
 */
public class LineChart implements Chart{
    public LineChart() {
        System.out.println("创建折线图");
    }

    @Override
    public void display() {
        System.out.println("显示折线图");
    }
}
