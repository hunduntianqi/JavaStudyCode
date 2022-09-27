package javabasic.l_face_object_advanced.Demo.$2_inheritDemo.Demo3;

public class Chef extends Staff{
    /*
        定义厨师类, 继承员工类
     */
    
    @Override
    public void work() {
        System.out.println(this.getName() + "作为一名厨师, 工作是为了做出美味的饭菜~~");
    }
    
    public Chef(int id, String name, double salary) {
        super(id, name, salary);
    }
    
    public Chef() {
    }
}
