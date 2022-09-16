package com.Feb_26_实战案例;
/*
    抓取彼岸图库4K图片信息:
        功能分析:
            1. 定义请求url:
                url = "https://pic.netbian.com/4kmeinv/"
            2. 解析返回的html数据
                使用Jsoup解析
 */

import org.apache.http.StatusLine;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.util.EntityUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class mainSpider {
    public static void main(String[] args) throws Exception {
        // 创建文件夹保存下载图片
        File dir = new File("./4K彼岸网美图/");
        try {
            dir.mkdir();
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (int i = 1; i < 140; i++) {
            // 定义请求url
            if (i == 1) {
                String url = "https://pic.netbian.com/4kmeinv/";
                parse_4K(url);
            } else {
                String url = "https://pic.netbian.com/4kmeinv/index_" + i + ".html";
                parse_4K(url);
            }

        }
    }

    public static void parse_4K(String url) throws Exception{
        // 创建连接池对象
        PoolingHttpClientConnectionManager pool = new PoolingHttpClientConnectionManager();
        // 创建HttpClient对象
        CloseableHttpClient httpget = HttpClients.custom().setConnectionManager(pool).build();
        // 创建get请求对象
        HttpGet get = new HttpGet(url);
        // 发送get请求
        CloseableHttpResponse response = httpget.execute(get);
        // 获取html页面源码
        String html = EntityUtils.toString(response.getEntity(), "gbk");
        // 创建Document对象
        Document document = Jsoup.parse(html);
        Elements element = document.select("ul > li > a[target]");
        for (int i = 0; i < element.size(); i++) {
            String pic_url = "https://pic.netbian.com" + element.get(i).attr("href");
            System.out.println(pic_url);
            // 创建图片详情页请求对象
            HttpGet Pic_get = new HttpGet(pic_url);
            // 发送请求
            CloseableHttpResponse pic_res = httpget.execute(Pic_get);
            // 获取html页面源码
            String pic_html = EntityUtils.toString(pic_res.getEntity(), "gbk");
            System.out.println(pic_html);
            // 创建Document对象
            Document pic_document = Jsoup.parse(pic_html);
            String pic_src = "https://pic.netbian.com" + pic_document.select("#img > img").get(0).attr("src");
            System.out.println(pic_src);
            String pic_name = pic_document.select(".photo-hd > h1").text();
            // 创建图片资源请求对象
            HttpGet img = new HttpGet(pic_src);
            CloseableHttpResponse img_src = httpget.execute(img);
//            String img_html = EntityUtils.toString(img_src.getEntity(), "utf-8");
//            System.out.println(img_html);
            // 创建字节输出流文件对象
            OutputStream os = new FileOutputStream("./4K彼岸网美图/" + pic_name + ".jpg", true);
            // 写入数据
            img_src.getEntity().writeTo(os);
            // 刷新数据
            os.flush();
            // 关闭文件
            img_src.close();
            pic_res.close();

        }
        response.close();

    }

}
