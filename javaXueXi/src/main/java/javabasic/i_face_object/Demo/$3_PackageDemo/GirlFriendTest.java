package javabasic.i_face_object.Demo.$3_PackageDemo;

public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFriend gf1 = new GirlFriend();
        gf1.setAge(18);
        gf1.setName("灵儿");
        gf1.setGender("小仙女");
        String name = gf1.getName();
        int age = gf1.getAge();
        String gender = gf1.getGender();
        System.out.println("女朋友的基本信息: " + name + gender + age + "岁" );
    }
}
