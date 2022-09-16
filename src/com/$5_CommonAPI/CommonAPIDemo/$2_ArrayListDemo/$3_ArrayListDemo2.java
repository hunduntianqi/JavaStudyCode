package com.$5_CommonAPI.CommonAPIDemo.$2_ArrayListDemo;

import java.util.ArrayList;

/*
    需求:
        某影院系统需要在后台存储上映三部电影, 然后依次展示出来
    分析:
        1. 三部电影是三个对象, 需要定义一个电影类, 定义一个集合存储电影类对象
        2. 创建三个电影对象, 封装相关数据, 把三个对象存入到集合中

 */
public class $3_ArrayListDemo2 {
    public static void main(String[] args) {
        // 定义电影类:Movie
        
        // 创建集合存储影片类对象
        ArrayList<$3_Movie> listmovie = new ArrayList<>();
        
        // 创建影片对象, 封装电影数据, 把对象加入到集合中
        $3_Movie m1 = new $3_Movie("《肖申克的救赎》", 9.7, "罗宾斯");
        listmovie.add(m1);
        $3_Movie m2 = new $3_Movie("霸王别姬", 9.6, "张国荣, 张丰毅");
        listmovie.add(m2);
        listmovie.add(new $3_Movie("阿甘正传", 9.5, "汤姆.汉克斯"));
        System.out.println(listmovie);
        
        // 遍历集合对象, 将集合中的影片对象展示出来
        for (int i = 0; i < listmovie.size(); i++) {
            $3_Movie movie = listmovie.get(i);
            System.out.print(movie.getName() + "\t");
            System.out.print(movie.getScore() + "\t");
            System.out.println(movie.getActor());
        }
    }
}

