package com.$21_XML;

/*
    XML概述:
        XML是可扩展标记语言(extensible Markup Language)的缩写, 是一种数据表示格式, 可以描述非常复杂的数据结构, 常用于传输和存储数据
    XML的特点和使用场景:
        特点:
            1. 是纯文本, 默认使用utf-8编码
            2. 可嵌套
            3. XML文件: 文件内容为XML内容
        使用场景:
            1. XML内容经常被当成消息进行网络传输, 或者作为配置文件用于存储系统的信息
            2. 作为软件的配置文件
    XML的创建和语法规则:
        1. 创建文件: 指创建一个XML类型的文件, 要求文件的后缀必须使用xml, 如 hello_world.xml
        2. 语法规则:
            2.1 XML文件的后缀名为:xml
            2.2 文档声明必须是第一行:
                <?xml version="1.0" encoding="UTF-8"?>:
                version: XML默认的版本号码, 该属性是必须存在的
                encoding: XML文件的编码格式
            2.3 XML的标签(元素)规则:
                2.3.1 标签有一对尖括号和合法标识符组成: <name></name>, 并且必须存在一个根标签, 有且只能有一个
                2.3.2 标签必须成对出现, 有开始有结束: <name></name>
                2.3.3 特殊标签可以不成对, 但是必须有结束标记, 如: <br/>
                2.3.4 标签中可以定义属性, 属性和标签名空格隔开, 属性值必须用引号引起来 <student id="1"></student>
                2.3.5 标签需要正确嵌套
            2.4 XML的其他组成:
                2.4.1 XML中可以定义注释信息: <!--注释内容-->
                2.4.2 XML文件中可以存在特殊字符:
                    &lt;: < 小于
                    &gt;: > 大于
                    &amp;: & 和号
                    &apos;: ' 单引号
                    &quot;: " 引号
                2.4.3 XML文件中可以存在CDATA区: <![CDATA[ ...内容...]]>
    XML文档约束:
        是用来限定xml文档中的标签以及属性应该怎么写, 用来强制约束程序员必须按照文档约束的规定来编写xml文件
        1. DTD 约束:
            1.1 编写DTD约束文档, 后缀必须是.dtd
            1.2 在需要编写的xml文件中导入该DTD约束文档
            1.3 按照约束的规定编写xml文档
            作用: 可以约束XML文件的编写
            缺点: 不能约束具体的数据类型
        2. schema 约束:
            2.1 可以约束具体的数据类型, 约束能力上更强大
            2.2 本身也是一个xml文件, 本身也受到其他约束文件的要求, 所以编写的更加严谨
            2.3 编写schema约束文档, 后缀必须是.xsd
            2.4 在需要编写的xml文件中导入该schema约束文档
            2.5 按照约束内容编写xml文件的标签
            优点: 可以约束xml文件标签内容格式和具体的数据类型
    XML解析技术:
        使用程序读取XML文件中的数据
        1. SAX解析: 读取一行解析一行
        2. DOM解析: 先将数据一次性加载到内存中, 根据树形结构解析
            DOM解析文档对象模型:
                加载数据获取Document对象代表整个xml文件
                Document对象: 整个xml文档
                Element对象: 标签
                Attribute对象: 属性
                Text对象: 文本内容
            DOM解析常用技术框架:
                Dom4j:
                    1. 下载dom4j jar包
                    2. 在类中导入使用
                        SAXReader类:
                            public SAXReader(): 创建Dom4j的解析器对象
                            Document read(String url): 加载XML文件成为Document对象
                        Document类:
                            Element getRootElement(): 获得根元素对象
                            解析XML的元素, 属性, 文本:
                                1. List<Element> elements(): 得到当前元素下的所有子元素
                                2. List<Element> elements(String name): 得到当前元素下指定名字的子元素返回集合
                                3. Element element(String name): 得到当前元素下指定名字的子元素, 如果有很多名字相同的返回第一个
                                4. String getName(): 获得元素名字
                                5. String attributeValue(String name): 通过属性名直接得到属性值
                                6. String elementText(子元素名): 得到指定名称的子元素的文本
                                7. String getText(): 得到文本内容
    XML检索技术-xpath:
        使用Xpath检索XML文件:
         1. 导入jar包(dom4j和jaxen-1.1.2.jar), Xpath技术依赖与Dom4j技术
         2. 通过Dom4j的SAXReader获取Document对象
         3. 利用Xpath提供的API, 结合Xpath的语法完成选取XML元素节点进行解析操作
         4. Document中与Xpath相关的API:
            4.1 Node selectSingNode("表达式"): 获取符合表达式的唯一元素
            4.2 List<Node> selectNodes("表达式"): 获取符合表达式的元素集合
        5. 检索方法:
            5.1 绝对路径: 从根节点开始逐层查找节点列表并打印信息
                /根元素/子元素/孙元素: 从根元素开始一级一级向下查找, 不能跨级
            5.2 相对路径: 先得到根节点, 再采用相对路径获取子节点
                ./子元素/孙元素: 从当前元素开始, 一级一级向下查找, 不能跨级
            5.3 全文搜索: 直接全文搜索相应元素
                //元素: 全文搜索元素
                //元素一/元素二: 全文搜索元素一下面的一级子元素二
                //元素一//元素二: 全文搜索元素一下面的所有子元素二
            5.4 属性查找:
                //@属性名: 全文查找属性对象, 无论是那个元素, 只要包含该属性名
                //元素[@属性名]: 查找元素对象, 全文搜索包含指定属性名的指定元素
                //元素[@属性名=值]: 查找元素对象, 全文搜索指定元素名和属性名, 并且属性值与指定属性值相等
 */

public class $1_XMLSummarize {
}
