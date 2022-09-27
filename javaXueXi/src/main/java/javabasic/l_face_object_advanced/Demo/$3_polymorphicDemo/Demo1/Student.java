package javabasic.l_face_object_advanced.Demo.$3_polymorphicDemo.Demo1;

public class Student extends Person{
    @Override
    public String toString() {
        return "Student{" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                '}';
    }
}
