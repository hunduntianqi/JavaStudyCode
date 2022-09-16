package com.Feb_25_java_spider_summarize;

/*
    HttpClient测试类
 */

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.StatusLine;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.util.ArrayList;

public class Feb_25_HttpClientTest {
    public static void main(String[] args) throws Exception {
        testPost();
        testGet();
//        System.out.println("这是Post和Get请求测试");

    }

    /**
     * get请求测试方法
     */
    public static void testGet() throws Exception {
        // 1. 创建一个HTTPClient对象(CloseableHttpClient), 使用工具类-HttpClients创建对象, 相当于打开一个浏览器
        CloseableHttpClient httpClient = HttpClients.createDefault(); // 创建一个HttpClient对象
        // 2. 创建一个HttpGet对象
        HttpGet httpget = new HttpGet("https://www.baidu.com");
        // 3. 使用HttpClient对象发送请求, 获得http响应对象
        CloseableHttpResponse response = httpClient.execute(httpget);
        // 得到服务端响应, 获取服务端状态码
        StatusLine statusLine = response.getStatusLine();
        System.out.println(statusLine);
        int statuscode = statusLine.getStatusCode(); // 获取状态响应码
        // 打印状态码
        System.out.println("响应状态码:" + statuscode);
        // 获取服务端响应内容
        HttpEntity entity = response.getEntity();
        String html = EntityUtils.toString(entity, "utf-8");
        // 打印Html
        System.out.println(html);
        // 关闭流
        response.close();
        httpClient.close();
    }

    /**
     * post请求测试方法
     */
    public static void testPost() throws Exception {
        // 1. 创建httpclient对象
        CloseableHttpClient httppost = HttpClients.createDefault();
        // 2. 创建post请求对象
        HttpPost post = new HttpPost("https://mail.qq.com/cgi-bin/frame_html");
        // 3. 创建HttpEntity对象, 相当于post请求提交的表单(HttpEntity为接口, 需使用对应实现类UrlEncodedFormEntity创建对象)
        // 创建一个List集合, 添加请求参数
        ArrayList<NameValuePair> form = new ArrayList<NameValuePair>();
        // 向集合中添加NameValuePair实现类BasicNameValuePair对象
        form.add(new BasicNameValuePair("sid", "QI3qz1oGgJ2EAWYE"));
        form.add(new BasicNameValuePair("r", "0e28d19eb9eb58654c23ad2243a0ae73"));
        HttpEntity entity = new UrlEncodedFormEntity(form, "gb18030");
        // 4. 将HttpEntity对象添加到post请求对象中
        post.setEntity(entity);
        // 5. 发送post请求
        CloseableHttpResponse response = httppost.execute(post);
        // 6. 接收响应数据
        StatusLine status = response.getStatusLine();
        // 打印响应状态码
        int statuscode = status.getStatusCode();
        System.out.println("响应状态码:" + statuscode);
        // 7. 打印页面源码
        HttpEntity entity_Html = response.getEntity();
        System.out.println(EntityUtils.toString(entity_Html, "gb18030"));
        // 8. 关闭响应流数据
        response.close(); // 关闭响应对象
        httppost.close(); // 关闭httpclient对象
    }
}