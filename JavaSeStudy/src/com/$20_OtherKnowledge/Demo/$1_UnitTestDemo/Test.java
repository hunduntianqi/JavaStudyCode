package com.$20_OtherKnowledge.Demo.$1_UnitTestDemo;

/*
    测试类
 */

import org.junit.Assert;

public class Test {
    /**
     * 测试方法:
     * 注意点:
     * 1. 必须是公开的, 无参数无返回值的方法
     * 2. 测试方法必须使用@Test注解标记
     */

    @org.junit.Test
    public void testloginName() {
        // 创建业务对象
        UserService userService = new UserService();
        String result = userService.loginName("admin", "123456");
        // 预期正确性测试: 断言
        Assert.assertEquals("您的业务数据可能有异常", "登陆成功", result);

    }

    @org.junit.Test
    public void testselectNames() {
        UserService userService = new UserService();
        userService.selectNames();
    }
}
