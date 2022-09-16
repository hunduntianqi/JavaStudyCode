package com.httpclientTest;

/*
    HttpClient测试类
 */

import org.apache.http.HttpEntity;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

public class HttpClientTest {
    public static void main(String[] args) throws Exception{
        testGet();
    }

    public static void testGet() throws Exception{
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
}