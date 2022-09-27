package javabasic.l_face_object_advanced.Demo.$4_CodeBlockDemo;

public class $2_Student{
    private String name;
    private int age;
    
    static {
        System.out.println("静态代码块执行了~~");
    }
    
    {
        // 定义构造代码块
        System.out.println("开始创建对象了~~");
    }
    
    public $2_Student () {
        System.out.println("空参构造");
    }
    
    public $2_Student (String name, int age) {
        System.out.println("有参数构造");
        this.name = name;
        this.age = age;
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
    
    @Override
    public String toString() {
        return "$2_Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
