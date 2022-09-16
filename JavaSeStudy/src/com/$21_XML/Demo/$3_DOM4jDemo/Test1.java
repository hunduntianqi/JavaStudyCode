package com.$21_XML.Demo.$3_DOM4jDemo;

/*
    目标: 学会使用Dom4j解析xml文件数据
        1. 导入dom4j框架
        2. 准备一个xml文件
 */

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.io.File;
import java.util.List;

public class Test1 {
    @Test
    public void parseXMLdata() throws Exception{
        // 1. 创建一个Dom4j的解析器对象, 代表了整个dom4j框架
        SAXReader saxReader = new SAXReader();
        // 2. 加载XML文件到内存中成为一个Document对象
        Document document = saxReader.read(new File("src/com/JavaGrammar/Mar_19_XML/Contacts.xml"));
        // 注意: getResourceAsStream()中的 / 是代表直接去src下寻找文件
//        InputStream is = Dom4jHelloWorldDemo.class.getResourceAsStream("com/JavaGrammar/Mar_19_XML/Contacts.xml");
//        Document document = saxReader.read(is);

        //  3. 获取根元素对象
        Element root = document.getRootElement();
        System.out.println(root.getName());
        // 获得根元素下的全部子元素
        List<Element> elements = root.elements("contact");
        for (Element element : elements) {
            System.out.println(element.getName());
        }

        // 得到某个元素
        Element user = root.element("user");
        System.out.println(user.getName());
        // 存在多个同名子元素时, 默认去第一个子元素对象
        Element contact = root.element("contact");
        // 获取元素嵌套的子元素文本内容
        System.out.println(contact.elementText("name"));
        // 获取子元素文本内容并去除前后空格
        System.out.println(contact.elementTextTrim("name"));
        // 根据元素获取属性值
        Attribute idAttr = contact.attribute("id");
        System.out.println(idAttr.getName() + "--->" + idAttr.getValue());
        // 获取当前元素下的子元素对象
        Element email = contact.element("email");
        System.out.println(email.getTextTrim());
    }
}
