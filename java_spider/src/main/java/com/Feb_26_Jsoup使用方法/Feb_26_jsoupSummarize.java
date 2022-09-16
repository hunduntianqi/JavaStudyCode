package com.Feb_26_Jsoup使用方法;

/*
    jsoup:
        可以解析html的工具包
        1. 使用方法:
            1. 添加jar包, Maven工程可以直接导入jar包坐标
            2. Jsoup.parse()方法解析页面
                参数:
                    可以是url:使用的不多
                    可以是本地的文件路径
                    可以是String类型变量
            3. 解析后可以得到Document对象
                Document document = Jsoup.parse(url, 1000);
            4. 使用Document的方法进行页面的解析
                先定位对应element节点

        2. 解析html的方法:
            2.1 使用Document自带的方法解析页面:
                element.text(): 取出该节点的文本内容
                element.attr("属性名"): 获取该节点对应的属性内容
                1. 根据标签名称选择节点: document.getElementsByTag("tag")
                2. 根据id名称选则节点: document.getElementByID("id")
                3. 根据类名class选择节点: document.getElementsByClass("类名")
                4. 根据属性attribute选择节点: document.getElementsByAttribute("属性名")
                5. 根据属性值attributeValue选择节点: document.getElementsByAttributeValue("属性名", "属性值")
            2.2 css选择器:
                select方法:在select方法中使用css选择器进行节点选择
                    // 根据标签选择
                    Elements es_tag = documet.select("title");
                    System.out.println(es_tag.text());
                    // 根据id选择
                    Elements es_id = documet.select("#pkg-overview");
                    System.out.println(es_id);
                    // 根据class选择
                    Elements es_class = documet.select(".section-header");
                    System.out.println(es_class);
                    // 根据属性名选择
                    Elements es_attribute = documet.select("[href]");
                    for (int i = 0; i < es_attribute.size(); i++) {
                        System.out.println(es_attribute.get(i));
                    }
                    System.out.println(es_attribute);
                    // 根据属性的值进行选择
                    Elements es_attributeValue = documet.select("[href=https://studygolang.com/static/pkgdoc/pkg/encoding_json.htm#pkg-index]");
                    System.out.println(es_attributeValue);
                    // 组合查询 直接节点(>), 间接节点(空格)
                    Elements es_group = documet.select("div.container > a > h3");
                    System.out.println(es_group.text());

 */

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.net.URL;

public class Feb_26_jsoupSummarize {
    public static void main(String[] args) throws Exception {
//        url();
        file();
//        str();

    }

    /**
     * 以url为构造参数创建Document对象
     */
    public static void url() throws Exception{
        // 使用jsoup创建一个Document对象, 构造参数为url
        URL url = new URL("http://www.baidu.com");
        Document document = Jsoup.parse(url, 1000);  // 参数1： URL对象, 参数2：超时时间, 单位为毫秒
        // 解析页面
        Elements elements = document.getElementsByTag("title"); // 根据标签提取元素
        System.out.println(elements.text()); // text()方法取标签的文本信息
    }

    /**
     * 以本地文件为构造参数创建Document对象
     */
    public static void file() throws Exception{
        // 以本地文件为参数创建Document对象
        File file = new File("D:\\Users\\Administrator\\IdeaProjects\\GoLanguageBasic\\src\\Go语言标准库文档中文版 _ Go语言中文网 _ Golang中文社区 _ Golang中国_files\\main.html");
        Document documet = Jsoup.parse(file, "utf-8"); // 参数1: 文件对象, 包含文件路径, 参数2: 文件编码格式
        // 解析文件内容
//        Elements elements = documet.getElementsByTag("title");
//        System.out.println(elements.text());
        // 使用select方法解析
        // 根据标签选择
        Elements es_tag = documet.select("title");
        System.out.println(es_tag.text());
        // 根据id选择
        Elements es_id = documet.select("#pkg-overview");
        System.out.println(es_id);
        // 根据class选择
        Elements es_class = documet.select(".section-header");
        System.out.println(es_class);
        // 根据属性名选择
        Elements es_attribute = documet.select("[href]");
        for (int i = 0; i < es_attribute.size(); i++) {
            System.out.println(es_attribute.get(i));
        }
        System.out.println(es_attribute);
        // 根据属性的值进行选择
        Elements es_attributeValue = documet.select("[href=https://studygolang.com/static/pkgdoc/pkg/encoding_json.htm#pkg-index]");
        System.out.println(es_attributeValue);
        // 组合查询 直接节点(>), 间接节点(空格)
        Elements es_group = documet.select("div.container > a > h3");
        System.out.println(es_group.text());
    }

    /**
     * 以字符串为构造参数创建Document对象
     */
    public static void str() throws Exception {
        // 定义一个字符串, 与html结构相似
        String str = "<!DOCTYPE html>\n" +
                "<!--STATUS OK--><html> <head><meta http-equiv=content-type content=text/html;charset=utf-8><meta http-equiv=X-UA-Compatible content=IE=Edge><meta content=always name=referrer><link rel=stylesheet type=text/css href=https://ss1.bdstatic.com/5eN1bjq8AAUYm2zgoY3K/r/www/cache/bdorz/baidu.min.css><title>百度一下，你就知道</title></head> <body link=#0000cc> <div id=wrapper> <div id=head> <div class=head_wrapper> <div class=s_form> <div class=s_form_wrapper> <div id=lg> <img hidefocus=true src=//www.baidu.com/img/bd_logo1.png width=270 height=129> </div> <form id=form name=f action=//www.baidu.com/s class=fm> <input type=hidden name=bdorz_come value=1> <input type=hidden name=ie value=utf-8> <input type=hidden name=f value=8> <input type=hidden name=rsv_bp value=1> <input type=hidden name=rsv_idx value=1> <input type=hidden name=tn value=baidu><span class=\"bg s_ipt_wr\"><input id=kw name=wd class=s_ipt value maxlength=255 autocomplete=off autofocus=autofocus></span><span class=\"bg s_btn_wr\"><input type=submit id=su value=百度一下 class=\"bg s_btn\" autofocus></span> </form> </div> </div> <div id=u1> <a href=http://news.baidu.com name=tj_trnews class=mnav>新闻</a> <a href=https://www.hao123.com name=tj_trhao123 class=mnav>hao123</a> <a href=http://map.baidu.com name=tj_trmap class=mnav>地图</a> <a href=http://v.baidu.com name=tj_trvideo class=mnav>视频</a> <a href=http://tieba.baidu.com name=tj_trtieba class=mnav>贴吧</a> <noscript> <a href=http://www.baidu.com/bdorz/login.gif?login&amp;tpl=mn&amp;u=http%3A%2F%2Fwww.baidu.com%2f%3fbdorz_come%3d1 name=tj_login class=lb>登录</a> </noscript> <script>document.write('<a href=\"http://www.baidu.com/bdorz/login.gif?login&tpl=mn&u='+ encodeURIComponent(window.location.href+ (window.location.search === \"\" ? \"?\" : \"&\")+ \"bdorz_come=1\")+ '\" name=\"tj_login\" class=\"lb\">登录</a>');\n" +
                "                </script> <a href=//www.baidu.com/more/ name=tj_briicon class=bri style=\"display: block;\">更多产品</a> </div> </div> </div> <div id=ftCon> <div id=ftConw> <p id=lh> <a href=http://home.baidu.com>关于百度</a> <a href=http://ir.baidu.com>About Baidu</a> </p> <p id=cp>&copy;2017&nbsp;Baidu&nbsp;<a href=http://www.baidu.com/duty/>使用百度前必读</a>&nbsp; <a href=http://jianyi.baidu.com/ class=cp-feedback>意见反馈</a>&nbsp;京ICP证030173号&nbsp; <img src=//www.baidu.com/img/gs.gif> </p> </div> </div> </div> </body> </html>\n";
        // 创建一个Document对象
        Document document = Jsoup.parse(str);
        // 解析页面
        Elements elsments = document.getElementsByTag("title");
        System.out.println(elsments.text());
    }
}
