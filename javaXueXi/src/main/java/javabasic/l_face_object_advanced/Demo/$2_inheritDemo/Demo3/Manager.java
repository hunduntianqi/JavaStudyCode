package javabasic.l_face_object_advanced.Demo.$2_inheritDemo.Demo3;

public class Manager extends Staff{
    /*
        定义经理类, 声明经理类自己的属性和行为, 并继承员工类
     */
    private double managerBonus;
    
    public Manager() {
    }
    
    public Manager(int id, String name, double salary, double managerBonus) {
        super(id, name, salary);
        this.managerBonus = managerBonus;
    }
    
    @Override
    public void work() {
        System.out.println(this.getName() + "的工作是管理员工");
    }
    
    public double getManagerBonus() {
        return managerBonus;
    }
    
    public void setManagerBonus(double managerBonus) {
        this.managerBonus = managerBonus;
    }
}
