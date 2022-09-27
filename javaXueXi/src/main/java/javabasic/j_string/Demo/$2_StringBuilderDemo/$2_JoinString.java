package javabasic.j_string.Demo.$2_StringBuilderDemo;

/*
    拼接字符串:
        定义一个方法, 把数组中的数据按照指定格式拼接成一个字符串返回
        例:
            数组 int[] arr= {1, 2, 3};
            拼接后为: [1, 2, 3]
 */

public class $2_JoinString {
    public static void main(String[] args) {
        // 定义一个int数组
        int[] array = {1, 2, 3};
        // 调用方法, 拼接字符串
        String str = joinString(array);
        System.out.printf("数组拼接后的字符串为: %s\n", str);
    }
    
    public static String joinString (int[] array) {
        // 创建一个StringBuilder对象
        StringBuilder sb = new StringBuilder("[");
        // 循环遍历数组, 并将数组元素添加进StringBuilder对象
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                sb.append(array[i] + "]");
            } else {
                sb.append(array[i] + ", ");
            }

        }
        return sb.toString();
    }
}
