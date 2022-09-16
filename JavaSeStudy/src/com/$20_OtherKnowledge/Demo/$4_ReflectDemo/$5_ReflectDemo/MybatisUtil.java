package com.$20_OtherKnowledge.Demo.$4_ReflectDemo.$5_ReflectDemo;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;

public class MybatisUtil {
    /**
     * 保存任意类型的对象
     *
     * @param obj
     */
    public static void save(Object obj) {
        try (
                // 创建打印流管道向文件写入数据
                PrintStream ps = new PrintStream(new FileOutputStream("E:\\Java\\JavaSeStudy\\JavaSeStudy\\src\\com\\$20_OtherKnowledge\\Demo\\$4_ReflectDemo\\$5_ReflectDemo\\data.txt",
                        true));
        ) {
            // 1. 提取这个对象的全部成员变量, 只有反射可以解决
            Class c = obj.getClass();
            ps.println("=============" + c.getSimpleName() + "==============");
            Field[] fields = c.getDeclaredFields();  // 提取全部成员变量
            // 遍历成员变量, 获取成员变量信息
            for (Field field : fields) {
                String name = field.getName();
                // 提取成员变量在obj对象中的值
                field.setAccessible(true);  // 暴力反射
                String value = field.get(obj) + "";  // 加双引号安全的转化为字符串类型数据
                ps.println(name + "=" + value);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
