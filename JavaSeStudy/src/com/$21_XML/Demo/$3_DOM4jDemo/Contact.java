package com.$21_XML.Demo.$3_DOM4jDemo;

public class Contact {
    private int id;
    private String name;
    private boolean vip;
    private char gender;
    private String email;

    public Contact() {
    }

    public Contact(int id, String name, boolean vip, char sex, String email) {
        this.id = id;
        this.name = name;
        this.vip = vip;
        this.gender = sex;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", vip=" + vip +
                ", sex=" + gender +
                ", email='" + email + '\'' +
                '}';
    }
}
