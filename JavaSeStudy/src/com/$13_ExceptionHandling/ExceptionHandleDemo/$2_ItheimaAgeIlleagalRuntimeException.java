package com.$13_ExceptionHandling.ExceptionHandleDemo;
/*
     自定义的编译时异常:
         1、继承RuntimeException
         2、重写构造器
 */
public class $2_ItheimaAgeIlleagalRuntimeException extends RuntimeException{
    public $2_ItheimaAgeIlleagalRuntimeException() {
    }

    public $2_ItheimaAgeIlleagalRuntimeException(String message) {
        super(message);
    }
}
