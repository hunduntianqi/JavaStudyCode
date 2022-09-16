package com.$13_ExceptionHandling.ExceptionHandleDemo;

/*
     自定义的编译时异常
         1、继承Exception
         2、重写构造器
 */

public class $2_ItheimaAgeIlleagalException extends Exception{
    public $2_ItheimaAgeIlleagalException() {
    }

    public $2_ItheimaAgeIlleagalException(String message) {
        super(message);
    }
}
