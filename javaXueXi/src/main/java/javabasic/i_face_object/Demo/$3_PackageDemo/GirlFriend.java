package javabasic.i_face_object.Demo.$3_PackageDemo;

public class GirlFriend {
    private String name;
    private int age;
    private String gender;
    
    // 定义无参构造
    public GirlFriend() {
    
    }
    // 定义有参构造器
    public GirlFriend(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    
    // 定义get(), set()方法
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public String getGender() {
        return gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }
}
