package javabasic.l_face_object_advanced.Demo.$4_CodeBlockDemo;

public class $1_PartCodeBlockDemo {
    public static void main(String[] args) {
        {
            // 定义局部代码块
            int a = 10;
            System.out.println(a);
        } // 代码执行到此处时, 变量a会从内存中消失
//        System.out.println(a);
    }
}
