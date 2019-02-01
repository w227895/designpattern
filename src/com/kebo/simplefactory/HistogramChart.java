package com.kebo.simplefactory;

/**
 * @ Author     ：kebo
 * @ Date       ：Created in 16:10 2019/2/1
 * @ Description：
 */
public class HistogramChart implements Chart {
    public HistogramChart(){
        System.out.println("创建柱状图");
    }
    @Override
    public void display() {
        System.out.println("显示柱状图");
    }
}
