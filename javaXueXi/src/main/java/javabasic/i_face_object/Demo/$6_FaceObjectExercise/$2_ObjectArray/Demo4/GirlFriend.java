package javabasic.i_face_object.Demo.$6_FaceObjectExercise.$2_ObjectArray.Demo4;

public class GirlFriend {
    private String name;
    private int age;
    private char gender;
    private String hobby;
    
    public GirlFriend() {
    }
    
    public GirlFriend(String name, int age, char gender, String hobby) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.hobby = hobby;
    }
    
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
    
    public char getGender() {
        return gender;
    }
    
    public void setGender(char gender) {
        this.gender = gender;
    }
    
    public String getHobby() {
        return hobby;
    }
    
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
    
    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", hobby='" + hobby + '\'' +
                '}';
    }
}
