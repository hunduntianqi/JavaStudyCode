package com.$20_OtherKnowledge.Demo.$2_DynamicProxyDemo;

public class Test {
    public static void main(String[] args) {
        UserService userservice = ProxyUtil.getProxy(new UserServiceImplementsClass());
        System.out.println(userservice.login("admin", "123456"));
        System.out.println(userservice.deleteUsers());
        userservice.selectUsers();
    }
}
