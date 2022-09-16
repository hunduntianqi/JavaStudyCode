package com.$20_OtherKnowledge;

/*
    单元测试:
        指针对最小的功能单元编写测试代码, Java程序的最小功能单元是方法, 单元测试就是针对Java方法的测试, 检查方法的正确性
        目前测试方法存在的问题:
            1. 只用一个main方法, 如果一个方法的测试失败了, 其他方法测试会收到影响
            2. 无法得到测试的结果报告, 需要程序员自己去观察测试是否成功
            3. 无法实现自动化测试
        JUnit单元测试框架:
            开源的Java语言实现的单元测试框架
            优点:
                1. 可以灵活的选择执行哪些测试方法, 可以一键执行全部测试方法
                2. 可以生成全部测试方法的测试报告, 测试良好为绿色, 测试失败为红色
                3. 某个测试方法测试失败, 不会影响其他方法的测试
            使用Junit测试框架
                1. 导入Junit的jar包到项目中
                2. 编写测试方法: 测试方法必须是公共的无参数无返回值的非静态方法
                3. 在测试方法上使用@Test注解: 标注该方法是一个测试方法
                4. 在测试方法中完成被测试方法的预期正确性测试
                    JUnit断言类:
                        Assert.assertEquals("断言失败提示信息", 期待值, 实际值)
                5. 选中测试方法, 选择JUnit运行, 如果测试良好是绿色, 如果测试失败, 是红色
            单元测试常用注解:
                JUnit5:
                1. @Test: 测试方法
                2. @BeforeEach / @Before: 用来修饰实例方法, 该方法会在每一个测试方法执行之前执行一次
                3. @AfterEach / @After: 用来修饰实例方法, 该方法会在每一个测试方法执行之后执行一次
                4. @BeforeAll / @BeforeClass: 用来修饰静态方法, 该方法会在所有测试方法执行之前只执行一次
                5. @AfterAll / @AfterClass: 用来修饰静态方法, 该方法会在所有测试方法之后只执行一次
                开始执行的方法: 一般为初始化资源
                执行完之后的方法: 一般为释放资源
 */

import org.junit.Test;

public class $1_UnitTestSummarize {
    public static void main(String[] args) {
        System.out.println("单元测试详解");
    }

    @Test
    public void junitTest() {
        System.out.println("这是Junit测试工具");
    }
}
