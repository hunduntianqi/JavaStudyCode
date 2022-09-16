package com.Feb_25_java_spider_summarize;

/*
    Java实现爬虫需要的工具包:
        1. 页面抓取:
            HttpClient: 模拟浏览器
            是apache旗下的一个开源项目
            使用方法:
                新建一个工程, 将httpclient需要的jar包添加到工程
            1.1 发送get请求方法:
                1. 创建一个HTTPClient对象(CloseableHttpClient)
                    使用工具类-HttpClients创建对象, 相当于打开一个浏览器
                    CloseableHttpClient httpClient = HttpClients.createDefault()
                2. 创建一个HTTPGet请求对象, 相当于一个get请求, 在构造参数中设置请求url
                    HttpGet httpget = new HttpGet("https://www.bilibili.com/video/BV1ey4y1V7qV?p=12&spm_id_from=pageDriver");
                    带参数get请求只需要在网站域名后添加相应的参数字段即可
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
            1.2 发送post请求:
                1. 创建HttpClient对象
                    HttpClient httppost = HttpClients.createDefault();
                2. 创建一个HttpPost对象
                    HttpPost post = new HttpPost("https://mail.qq.com/cgi-bin/frame_html");
                3. 创建HttpEntity对象, 相当于post请求提交的表单(HttpEntity为接口, 需使用对应实现类UrlEncodedFormEntity创建对象)
                    HttpEntity entity = new UrlEncodedFormEntity(List<? extends NameValuePair> parameters, String charset)
                    // 创建一个List集合, 添加请求参数
                    ArrayList<NameValuePair> form = new ArrayList<NameValuePair>();
                    // 向集合中添加NameValuePair实现类BasicNameValuePair对象
                    form.add(new BasicNameValuePair("sid", "QI3qz1oGgJ2EAWYE"));
                    form.add(new BasicNameValuePair("r", "0e28d19eb9eb58654c23ad2243a0ae73"));
                    集合创建完成并添加相应表单数据后, 创建HttpEntity实现类对象
                    HttpEntity entity = new UrlEncodedFormEntity(form, "utf-8");
                4. 把表单添加到HttpPost对象中
                    post.setEntity(entity);
                5. 发送post请求
                    CloseableHttpResponse response = httppost.execute(post);
                6. 接收服务端响应数据
                7. 打印输出响应数据
                8. 关闭响应流对象
            使用连接池管理HttpClient对象:
                1. 创建连接池对象:
                    PoolingHttpClientConnectionManager cm= new PoolingHttpClientConnectionManager();
                2. 使用HttpClients.customer()方法创建HttpClient对象并设置连接池
                    CloseableHttpClient httpobject = HttpClients.custom().setConnectionManager(cm).build();
                3. 创建请求对象
                4. 发送请求
                5. 打印结果
                6. 关闭Response对象
                    注意: 使用连接池不需要关闭HttpClient对象
        2. 页面解析:
            jsoup:
                可以解析html的工具包
                使用方法:
                    1. 添加jar包, Maven工程可以直接导入jar包坐标
                    2. Jsoup.parse()方法解析页面
                        参数:
                            可以是url:使用的不多
                            可以是本地的文件路径
                            可以是String类型变量
                    3. 解析后可以得到Document对象
                    4. 使用Document的方法进行页面的解析

 */

public class Feb_25_java_spider_summarize {
}
