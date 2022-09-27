package javabasic.k_ArrayList.Demo.$1_ArrayListTraverse;

public class $1_Student {
    private String name;
    private int age;
    
    public $1_Student() {}
    public $1_Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName () {
        return this.name;
    }
    
    public void setAge (int age) {
        this.age = age;
    }
    
    public int getAge () {
        return this.age;
    }
    
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
