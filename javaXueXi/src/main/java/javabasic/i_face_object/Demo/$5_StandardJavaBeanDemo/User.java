package javabasic.i_face_object.Demo.$5_StandardJavaBeanDemo;

public class User {
    // 定义属性
    private String userName;
    private String passWord;
    private String email;
    private char gender;
    private int age;
    
    // 无参构造
    public User () {}
    
    // 带参构造
    public User (String userName, String passWord, String email, char gender, int age) {
        this.userName = userName;
        this.passWord = passWord;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }
    
    // 定义get&set方法
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public String getUserName () {
        return this.userName;
    }
    
    public void setPassWord (String passWord) {
        this.passWord = passWord;
    }
    
    public String getPassWord () {
        return this.passWord;
    }
    
    public void setEmail (String email) {
        this.email = email;
    }
    
    public String getEmail () {
        return this.email;
    }
    
    public void setGender (char gender) {
        this.gender = gender;
    }
    
    public char getGender() {
        return this.gender;
    }
    
    public void setAge (int age) {
        this.age = age;
    }
    
    public int getAge () {
        return this.age;
    }
}
