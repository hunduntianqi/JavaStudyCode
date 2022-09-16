package com.Feb_26_Jsoup使用方法;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class test {
    public static void main(String[] args) throws Exception{
        CloseableHttpClient httpget = HttpClients.createDefault();
        HttpGet get = new HttpGet("https://pic.netbian.com/tupian/28961.html");
        CloseableHttpResponse res = httpget.execute(get);
        System.out.println(EntityUtils.toString(res.getEntity(), "gbk"));
        res.close();
        httpget.close();
    }

}
