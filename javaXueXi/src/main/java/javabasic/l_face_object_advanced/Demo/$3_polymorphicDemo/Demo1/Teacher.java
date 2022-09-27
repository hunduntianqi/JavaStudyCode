package javabasic.l_face_object_advanced.Demo.$3_polymorphicDemo.Demo1;

public class Teacher extends Person{
    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                '}';
    }
}
