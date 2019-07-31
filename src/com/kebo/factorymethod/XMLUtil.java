package com.kebo.factorymethod;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * @description: 解析XML配置文件信息
 * @Author: kb
 * @Date: 2019-07-30 16:19
 */
public class XMLUtil {
    public static Object getBean(){
        try{
            DocumentBuilderFactory documentBuilderFactory=DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder=documentBuilderFactory.newDocumentBuilder();
            Document document;
            document=documentBuilder.parse(new File("src//com//kebo//factorymethod//config.xml"));
            NodeList nodeList=document.getElementsByTagName("className");
            Node classNode=nodeList.item(0).getFirstChild();
            String cName=classNode.getNodeValue();
            Class c=Class.forName(cName);
            Object object=c.newInstance();
            return object;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
