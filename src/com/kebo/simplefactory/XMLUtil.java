package com.kebo.simplefactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.*;
import java.io.*;

/**
 * @description: 解析XML配置文件信息
 * @Author: kb
 * @Date: 2019-07-30 16:19
 */
public class XMLUtil {
    public static String getChartType(){
        try{
            DocumentBuilderFactory documentBuilderFactory=DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder=documentBuilderFactory.newDocumentBuilder();
            Document document;
            document=documentBuilder.parse(new File("src//com//kebo//simplefactory//config.xml"));
            NodeList nodeList=document.getElementsByTagName("chartType");
            Node classNode=nodeList.item(0).getFirstChild();
            String chartType=classNode.getNodeValue().trim();
            return chartType;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
