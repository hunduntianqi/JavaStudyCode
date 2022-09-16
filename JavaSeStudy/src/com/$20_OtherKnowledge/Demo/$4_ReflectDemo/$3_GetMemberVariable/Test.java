package com.$20_OtherKnowledge.Demo.$4_ReflectDemo.$3_GetMemberVariable;

/*
    反射获取成员变量
 */

import java.lang.reflect.Field;

public class Test {
    // 获取全部成员变量
    // Field[] getDeclardeFields();
    @org.junit.Test
    public void getDeclaredFields() {
        // 1. 定位class对象
        Class c = Student.class;
        // 2. 获取成员变量
        Field[] fields = c.getDeclaredFields();
        // 3. 遍历成员变量
        for (Field field : fields) {
            System.out.println(field.getName() + "===>" + field.getType());
        }
    }

    // 获取某个成员变量
    // Field[] getDeclardeFields();
    @org.junit.Test
    public void getDeclaredField() throws Exception {
        // 1. 定位class对象
        Class c = Student.class;
        // 2. 根据名称获取某个成员变量
        Field field = c.getDeclaredField("name");
        // 3. 打印成员变量
        System.out.println(field.getName()  + "\n" + field.getType());
        // 为成员变量赋值
        // 私有成员需要暴力反射
        field.setAccessible(true);
        Student s = new Student();
        field.set(s, "郭鹏涛");
        System.out.println(s.getName());
        // 取值
        String name = (String) field.get(s);
        System.out.println(name);
    }
}
