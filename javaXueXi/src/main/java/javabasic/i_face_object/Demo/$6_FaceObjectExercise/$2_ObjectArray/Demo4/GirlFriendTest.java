package javabasic.i_face_object.Demo.$6_FaceObjectExercise.$2_ObjectArray.Demo4;

/*
    定义数组存储4个女朋友的对象
        属性: 姓名, 年龄, 性别, 爱好
    要求:
        1. 计算出平均年龄
        2. 统计年龄比平均值低的女朋友有几个, 并打印所有信息
 */

public class GirlFriendTest {
    public static void main(String[] args) {
        // 定义数组
        GirlFriend[] array = new GirlFriend[4];
        // 创建对象并存入数组
        GirlFriend girlFriend1 = new GirlFriend("陈欣妮", 24, '女', "麻辣烫");
        array[0] = girlFriend1;
        GirlFriend girlFriend2 = new GirlFriend("张雪", 23, '女', "一梦江湖");
        array[1] = girlFriend2;
        GirlFriend girlFriend3 = new GirlFriend("徐冬梅", 24, '女', "唱歌");
        array[2] = girlFriend3;
        GirlFriend girlFriend4 = new GirlFriend("陶静", 23, '女', "买买买");
        array[3] = girlFriend4;
        // 定义变量存储年龄平均值
        double ageAverage = 0;
        for (int i = 0; i < array.length; i++) {
            ageAverage += array[i].getAge();
        }
        ageAverage = ageAverage / 4.0;
        System.out.printf("平均年龄为%.2f\n", ageAverage);
        int count = 0;
        for (int i =0; i < array.length; i++) {
            if (array[i].getAge() < ageAverage) {
                count++;
                System.out.println(array[i]);
            }
        }
        System.out.printf("年龄小于平均值的有%d个\n", count);
    }
}
