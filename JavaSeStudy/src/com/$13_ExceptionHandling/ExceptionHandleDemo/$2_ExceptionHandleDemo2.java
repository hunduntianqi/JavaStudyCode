package com.$13_ExceptionHandling.ExceptionHandleDemo;

/*
    目标:自定义异常(了解)
 */

public class $2_ExceptionHandleDemo2 {
    // 需求：认为年龄小于0岁，大于200岁就是一个异常。
    public static void main(String[] args) {
//        try {
//            checkAge(-34);
//        } catch (ItheimaAgeIlleagalException e) {
//            e.printStackTrace();
//        }

        try {
            checkAge2(15);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void checkAge2(int age) {
        if(age < 0 || age > 200){
            // 抛出去一个异常对象给调用者
            // throw ：在方法内部直接创建一个异常对象，并从此点抛出
            // throws : 用在方法申明上的，抛出方法内部的异常
            throw new $2_ItheimaAgeIlleagalRuntimeException(age + " is illeagal!");
        }else {
            System.out.println("年龄合法：推荐商品给其购买~~");
        }
    }

    public static void checkAge(int age) throws $2_ItheimaAgeIlleagalException {
        if(age < 0 || age > 200){
            // 抛出去一个异常对象给调用者
            // throw ：在方法内部直接创建一个异常对象，并从此点抛出
            // throws : 用在方法申明上的，抛出方法内部的异常
            throw new $2_ItheimaAgeIlleagalException(age + " is illeagal!");
        }else {
            System.out.println("年龄合法：推荐商品给其购买~~");
        }
    }
}
