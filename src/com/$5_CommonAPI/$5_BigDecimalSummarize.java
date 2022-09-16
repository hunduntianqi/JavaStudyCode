package com.$5_CommonAPI;

/*
    BigDecimal作用:
        用于解决浮点型运算精度失真的问题
        使用步骤:
            创建对象BigDecimal封装浮点型数据(最好的方式是调用方法)
            public static BigDecimal valueOf(double val):包装浮点数成为BigDecimal对象
            获取BigDecimal对象:
                BigDecimal b1 = BigDecimal.valueOf(浮点数);
        常用方法:
            1.public BigDecimal add(BigDecimal b): 加法
            2.public BigDecimal subtract(BigDecimal b):减法
            3.public BigDecima multiply(BigDecimal b):乘法
            4.public BigDecimal divide(BigDecimal b):除法
            5.public BigDecimal divide(另一个BigDecimal对象, 精确几位, 舍入模式):除法
        注意事项:
            BigDecimal一定要进行精度运算, 如果传入数据无法进行精度运算, 系统会崩溃
 */

public class $5_BigDecimalSummarize {
}
