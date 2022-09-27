package javabasic.l_face_object_advanced.Demo.$1_staticDemo.Demo3;

import java.util.ArrayList;

public class Util {
    private Util () {}
    
    public static int getMaxAge(ArrayList<Student> list) {
        int maxAge = list.get(0).getAge();
        for (int i = 0; i < list.size(); i++) {
            maxAge = maxAge > list.get(i).getAge() ? maxAge : list.get(i).getAge();
        }
        return maxAge;
    }
}
