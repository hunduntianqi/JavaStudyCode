package com.$14_LogFramework;

/*
    日志技术快速体验
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class $2_LogbackQuickExperience {
    // 创建Logback的日志对象, 代表日志技术
    public static final Logger LOGGER = LoggerFactory.getLogger("LogbackSummarize.class");

    public static void main(String[] args) {
        try {
            LOGGER.debug("main方法开始执行了！！");
            LOGGER.info("我开始记录第二行日志, 我要开始做除法~~~");
            int a = 10;
            int b = 2;
            LOGGER.trace("a:" + a);
            LOGGER.trace("b:" + b);
            System.out.println(a / b);
        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.error("程序运行出现异常:" + e);
        }
    }
}
