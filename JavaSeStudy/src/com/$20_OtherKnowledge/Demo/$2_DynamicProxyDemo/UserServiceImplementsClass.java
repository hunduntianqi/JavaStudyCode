package com.$20_OtherKnowledge.Demo.$2_DynamicProxyDemo;

public class UserServiceImplementsClass implements UserService{
    @Override
    public String login(String loginName, String passWord) {
        try {
            Thread.sleep(1000);
            if ("admin".equals(loginName) && "123456".equals(passWord)) {
                return "登录成功！！";
            }
            return "登录名或密码不正确！！";
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
    }

    @Override
    public void selectUsers() {
        System.out.println("查询了100个用户数据！！");
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public boolean deleteUsers() {
        try {
            System.out.println("删除了100个用户数据");
            Thread.sleep(500);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
