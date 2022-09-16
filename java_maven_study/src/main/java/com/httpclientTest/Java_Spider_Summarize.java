package com.httpclientTest;

/*
    Java实现爬虫需要的工具包:
        1. 页面抓取:
            HttpClient: 模拟浏览器
            是apache旗下的一个开源项目
            使用方法:
                新建一个工程, 将httpclient需要的jar包添加到工程
            发送get请求方法:
                1. 创建一个HTTPClient对象(CloseableHttpClient)
                    使用工具类-HttpClients创建对象, 相当于打开一个浏览器
                    CloseableHttpClient httpClient = HttpClients.createDefault()
                2. 创建一个HTTPGet请求对象, 相当于一个get请求, 在构造参数中设置请求url
                    HttpGet httpget = new HttpGet("https://www.bilibili.com/video/BV1ey4y1V7qV?p=12&spm_id_from=pageDriver");
                3. 使用HttpClient对象发送请求, 获得响应对象
                    CloseableHttpResponse response = httpClient.execute(httpget);
                4. 得到服务端响应, 获取响应
                    StatusLine statusLine = response.getStatusLine();
                    System.out.println(statusLine);
                    int statuscode = statusLine.getStatusCode(); // 获取状态响应码
                    // 打印状态码
                    System.out.println(statuscode);
                    // 获取服务端响应内容
                    HttpEntity entity = response.getEntity();
                    String html = EntityUtils.toString(entity, "utf-8");
                    // 打印Html
                    System.out.println(html);
                5. 关闭流
                    response.close(); // 关闭响应对象
                    httpClient.close(); // 关闭HTTPClient对象
        2. 页面解析:
            Jsoup: 解析Html, 可以像使用jquery一样解析html
    测试工程搭建:


 */
public class Java_Spider_Summarize {
}
