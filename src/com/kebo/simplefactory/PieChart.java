package com.kebo.simplefactory;

/**
 * @ Author     ：kebo
 * @ Date       ：Created in 16:14 2019/2/1
 * @ Description：
 */
public class PieChart implements  Chart {
    public PieChart(){
        System.out.println("创建饼状图");
    }
    @Override
    public void display() {
        System.out.println("显示饼状图");
    }
}
