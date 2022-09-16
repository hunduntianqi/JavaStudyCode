package com.$21_XML.Demo.$2_XpathParse;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.io.File;
import java.util.List;

public class $1_XpathParseDemo {
    /**
     * 1. 根据绝对路径定位元素:
     * /根元素/子元素/子元素
     */
    @Test
    public void parse01() throws Exception {
        // 1. 创建解析器对象
        SAXReader saxreader = new SAXReader();
        // 2. 加载XML文件
        Document document = saxreader.read(new File("JavaSeStudy/src/com/$21_XML/Demo/$1_XMLDemo/Contacts2.xml"));
        // 3. 检索全部的名称内容
        List<Node> nameNodes = document.selectNodes("/contactList/contact/name");
        for (Node nameNode : nameNodes) {
            Element nameEle = (Element) nameNode;
            System.out.println(nameEle.getTextTrim());
        }
    }

    /**
     * 2. 根据相对路径定位元素:
     * ./子元素/子元素
     */
    @Test
    public void parse02() throws Exception {
        // 1. 创建解析器对象
        SAXReader saxreader = new SAXReader();
        // 2. 加载XML文件
        Document document = saxreader.read(new File("JavaSeStudy/src/com/$21_XML/Demo/$1_XMLDemo/Contacts2.xml"));
        // 获取根元素对象
        Element root = document.getRootElement();
        // 3. 检索全部的名称内容
        List<Node> nameNodes = root.selectNodes("./contact/name");
        for (Node nameNode : nameNodes) {
            Element nameEle = (Element) nameNode;
            System.out.println(nameEle.getTextTrim());
        }
    }

    /**
     * 3. 全文检索:
     * //元素: 在全文找这个元素
     * //元素1/元素2: 在全文找元素1下面的一级元素2
     * //元素1//元素2: 在全文找元素1下面的全部元素2
     */
    @Test
    public void parse03() throws Exception {
        // 1. 创建SAXReader对象
        SAXReader saxreader = new SAXReader();
        // 2. 加载XML文件
        Document document = saxreader.read(new File("JavaSeStudy/src/com/$21_XML/Demo/$1_XMLDemo/Contacts2.xml"));
        // 3. 检索数据
//        List<Node> nameNodes = document.selectNodes("//name");
//        List<Node> nameNodes = document.selectNodes("//contact/name");
        List<Node> nameNodes = document.selectNodes("//contact//name");
        for (Node nameNode : nameNodes) {
            Element nameEle = (Element) nameNode;
            System.out.println(nameEle.getTextTrim());
        }
    }

    /**
     * 4. 属性查找
     * //@属性名称: 在全文检索属性对象
     * //元素[@属性名称]: 在全文检索包含该属性的元素对象
     * //元素[@属性名称=值]: 在全文检索包含该属性的元素且属性值为该值的元素对象
     */
    @Test
    public void parse04() throws Exception {
        // 1. 创建SAXReader对象
        SAXReader saxreader = new SAXReader();
        // 2. 加载XML文件
        Document document = saxreader.read(new File("JavaSeStudy/src/com/$21_XML/Demo/$1_XMLDemo/Contacts2.xml"));
        // 3. 检索数据
        List<Node> nodes = document.selectNodes("//@id");
        for (Node node : nodes) {
            Attribute nodeattr = (Attribute) node;
            System.out.println(nodeattr.getName() + "--->" + nodeattr.getValue());
        }

        List<Node> node_attr = document.selectNodes("//name[@id]");
        for (Node node : node_attr) {
            Element nodeattr = (Element) node;
            System.out.println(nodeattr.getName() + "---> id=" + nodeattr.attributeValue("id"));
        }
    }
}
