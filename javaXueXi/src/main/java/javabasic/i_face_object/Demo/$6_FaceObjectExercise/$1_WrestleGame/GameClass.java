package javabasic.i_face_object.Demo.$6_FaceObjectExercise.$1_WrestleGame;

public class GameClass {
    public static void main(String[] args) throws Exception {
        // 创建GameRole对象
        GameRole qiaoFeng = new GameRole("乔峰", 100, '男');
        GameRole jiuMoZhi = new GameRole("鸠摩智", 100, '男');
        
        qiaoFeng.showRoleInfo();
        System.out.println("================");
        jiuMoZhi.showRoleInfo();
        // 开始进行格斗
        System.out.println("======双方格斗开始======");
        boolean flag = true;
        while (flag) {
            System.out.println("乔峰攻击鸠摩智~~");
            qiaoFeng.attack(jiuMoZhi);
            if (qiaoFeng.getBlood() > 0 && jiuMoZhi.getBlood() == 0) {
                System.out.println("乔峰干掉了鸠摩智！！");
                flag = false;
                continue;
            }
            System.out.println("鸠摩智攻击乔峰~~");
            jiuMoZhi.attack(qiaoFeng);
             if (qiaoFeng.getBlood() == 0 && jiuMoZhi.getBlood() > 0) {
                System.out.println("鸠摩智干掉了乔峰, 这不可能, On No~~");
                flag = false;
            }
        }
    }
}
