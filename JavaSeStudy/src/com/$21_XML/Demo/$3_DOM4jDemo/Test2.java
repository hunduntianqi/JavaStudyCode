package com.$21_XML.Demo.$3_DOM4jDemo;

/*
    需求: 解析XML中的数据为一个List集合对象
 */

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Test2 {
    @Test
    public void parseToList() throws Exception {
        // 1.导入框架(Dom4j)
        // 2. 创建SAXReader对象
        SAXReader saxreader = new SAXReader();
        // 3. 加载XML文件为文档对象Document()
        Document document = saxreader.read(new File("src/com/JavaGrammar/Mar_19_XML/Contacts.xml"));
        // 4. 获取根元素
        Element root = document.getRootElement();
        // 5. 获取所有的contact子元素
        List<Element> contactEles = root.elements("contact");
        // 6. 准备一个ArrayList封装contact对象信息
        List<Contact> contacts = new ArrayList<>();
        // 7. 遍历所有的contact元素
        for (Element contactEle : contactEles) {
            // 8. 每个子元素都是一个联系人对象
            Contact contact = new Contact();
            contact.setId(Integer.valueOf(contactEle.attributeValue("id")));
            contact.setVip(Boolean.valueOf(contactEle.attributeValue("vip")));
            contact.setName(contactEle.elementTextTrim("name"));
            contact.setGender(contactEle.elementTextTrim("gender").charAt(0));
            contact.setEmail(contactEle.elementTextTrim("email"));
            // 9. 将联系人对象添加到集合中
            contacts.add(contact);
        }
        System.out.println(contacts);
        // 遍历集合
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }
}
