package com.$7_DateClass;

/*
    SimpleDateFormat类作用:
        1. 可以把Date对象或时间毫秒值格式化成我们喜欢的时间形式
        2. 可以把字符串的时间形式解析成日期对象
        构造器:
            public SimpleDateFormat(): 构造一个SimpleDateFormat对象, 使用默认格式
            public SimpleDateFormat(String pattern): 构造一个SimpleDateFormat对象, 使用指定的格式
        格式化方法:
            public final String format(Date date):将日期格式化成日期 / 时间字符串
            public final String format(Object time):将时间毫秒值格式化成日期 / 时间字符串

        格式化时间形式常用模式对应关系:
            y-年
            M-月
            d-日
            H-时
            m-分
            s-秒
            例:2020-11-11 13:27:06 -> yyyy-MM-dd HH:mm:ss
                2020年11月11日 13:27:06 -> yyyy年MM月dd日 HH:mm:ss

        解析字符串时间为日期对象:
            public Date parse(String source):从给定字符串的开始解析文本以生成日期
            注意:
                解析字符串时, 构造器格式化字符必须与字符串内时间格式完全一致, 否则系统报错！！
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class $3_SimpleDateFormatClassSummarize {
    public static void main(String[] args) throws ParseException {
        // 创建日期对象
        Date d = new Date();
        System.out.println(d);
        
        // 格式化日期对象(指定最终格式化的形式)
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E a");
        
        // 格式化日期对象为字符串形式
        String date = sdf.format(d);
        System.out.println(date);
        
        // 格式化时间毫秒值
        long time = System.currentTimeMillis();
        // 累加121秒后的时间
        time += 121 * 1000;
        String date2 = sdf.format(time);
        System.out.println(date2);
        
        // 解析字符串为日期对象
        /**
         *  需求:
         *      计算出2021年08月06日11点11分11秒, 往后走2天14小时49分06秒后的时间
         */
        String strDate = "2021年08月06日 11:11:11秒";
        // 将字符串时间解析成日期对象, 解析是形式必须与字符串形式完全一样, 否则运行时解析报错
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss"); // 形式与字符串完全一致
        // 解析字符串
        Date strD = sdf2.parse(strDate);
        // 将时间毫秒值往后走2天14小时49分06秒
        long timeStr = d.getTime() + (((2L * 24 + 14 ) * 60 + 49) * 60 + 6 ) * 1000;
        // 输出计算后的时间
        System.out.println(sdf2.format(timeStr));
    }
}
