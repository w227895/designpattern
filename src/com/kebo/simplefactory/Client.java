package com.kebo.simplefactory;

/**
 * @ Author     ：kebo
 * @ Date       ：Created in 16:43 2019/2/1
 * @ Description：
 */
public class Client {
    public static void main(String[] args) {
        //简单的读取
       /* Chart chart;
        chart=ChartFactory.getChart("pie");
        chart.display();*/
       //从xml文件中读取
        Chart chart;
        String type=XMLUtil.getChartType();
        System.out.println(type);
        chart=ChartFactory.getChart(type);
        chart.display();
    }
}
