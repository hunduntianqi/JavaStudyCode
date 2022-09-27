package javabasic.l_face_object_advanced.Demo.$2_inheritDemo.Demo3;

public class Staff {
    /*
        定义员工类, 定义员工共有的一些属性和行为
     */
    private int id;
    private String name;
    private double salary;
    
    public void work () {
    
    }
    
    public void eat () {
        System.out.println("%s在吃米饭".formatted(this.name));
    }
    
    public Staff(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    
    public Staff() {
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
    
    public double getSalary() {
        return salary;
    }
    
    public void setPrice(double salary) {
        this.salary = salary;
    }
}
