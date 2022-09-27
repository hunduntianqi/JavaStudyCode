package javabasic.i_face_object.Demo.$6_FaceObjectExercise.$1_WrestleGame;

/*
    游戏角色类
 */

import java.util.Random;

public class GameRole {
    private String roleName; // 角色名
    private int blood; // 生命值
    private char gender;
    private String face;
    
    String[] boyFace = {"风流俊雅", "气宇轩昂", "相貌英俊", "五官端正", "相貌平平", "一塌糊涂", "面目狰狞"};
    String[] girlFace = {"美奂绝伦", "沉鱼落雁", "婷婷玉立", "身材姣好", "相貌平平", "相貌简陋", "惨不忍睹"};
    
    public GameRole () {}
    
    public GameRole (String roleName, int blood, char gender) {
        this.roleName = roleName;
        this.blood = blood;
        this.gender = gender;
        this.judge(this.gender);
    }
    
    // 判断是男是女
    public void judge (char gender) {
        if (this.gender == '男') {
            this.face = this.getArrayElement(boyFace);
        } else if (this.gender == '女') {
            this.face = this.getArrayElement(girlFace);
        } else {
            this.face = "长相无法用人类语言形容";
        }
    }
    
    // 定义方法随机获取数组内容
    public String getArrayElement (String[] array) {
        Random random = new Random();
        int  index = random.nextInt(array.length);
        String face = array[index];
        return face;
    }
    
    public void setGender (char gender) {
        this.gender = gender;
    }
    
    public char getGender () {
        return this.gender;
    }
    
    public void setFace (String face) {
        this.face = face;
    }
    
    public String getFace () {
        return this.face;
    }
    
    public void setRoleName (String roleName) {
        this.roleName = roleName;
    }
    
    public String getRoleName () {
        return this.roleName;
    }
    
    public void setBlood (int blood) {
        this.blood = blood;
    }
    
    public int getBlood () {
        return this.blood;
    }
    
    // 定义攻击方法
    // 将敌人作为参数, 调用攻击方法时, 随机减少敌人血量
    public void attack (GameRole enemy) {
        // 创建Random对象
        Random random = new Random();
        int hurt = random.nextInt(5) + 5;
        // 随机减少敌人血量
        enemy.setBlood(enemy.getBlood() - hurt);
        // 判断敌人血量是否小于0, 小于0将其修改为0
        if (enemy.getBlood() < 0) {
            enemy.setBlood(0);
        }
        System.out.println(this.roleName + "打了" + enemy.getRoleName() + "一下, 造成了" + hurt + "点伤害,"
        + enemy.getRoleName() + "还剩" + enemy.getBlood() + "点血量！！");
    }
    
    public void showRoleInfo () {
        System.out.println("name: " + this.getRoleName());
        System.out.println("blood: " + this.getBlood());
        System.out.println("gender: " + this.getGender());
        System.out.println("face: " + this.getFace());
    }
}
