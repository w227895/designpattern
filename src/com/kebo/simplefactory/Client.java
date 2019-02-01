package com.kebo.simplefactory;

/**
 * @ Author     ：kebo
 * @ Date       ：Created in 16:43 2019/2/1
 * @ Description：
 */
public class Client {
    public static void main(String[] args) {
        Chart chart;
        chart=ChartFactory.getChart("pie");
        chart.display();
    }
}
