package javabasic.l_face_object_advanced.Demo.$3_polymorphicDemo.Demo1;

public class Administrator extends Person{
    @Override
    public String toString() {
        return "Administrator{" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                '}';
    }
}
