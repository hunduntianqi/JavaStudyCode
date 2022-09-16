package com.$15_ComprehensiveCase_MovieBuyTicketSystem.JavaBean;

import java.util.Date;

public class Movie {
    private String name;
    private String actor;
    private double score;
    private double time;
    private double price;
    private int number; // 余票
    private Date startTime; // 放映时间

    public Movie() {
    }

    public Movie(String name, String actor, double time,  double price, int number, Date starttime) {
        this.name = name;
        this.actor = actor;
        this.score = score;
        this.time = time;
        this.price = price;
        this.number = number;
        this.startTime = starttime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Date getStarttime() {
        return startTime;
    }

    public void setStarttime(Date starttime) {
        this.startTime = starttime;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", actor='" + actor + '\'' +
                ", score=" + score +
                ", time=" + time +
                ", price=" + price +
                ", number=" + number +
                ", starttime=" + startTime +
                '}';
    }
}
