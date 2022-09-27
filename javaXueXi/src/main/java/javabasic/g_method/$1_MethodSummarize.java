package javabasic.g_method;
/*
    方法概述:
        方法(method)是程序中最小的执行单元
        应用场景: 重复的代码, 具有独立功能的代码可以抽取到方法中
        优势: 可以减少代码冗余, 提高代码的复用性, 提高代码的可维护性
    方法定义格式:
        修饰符 返回值类型 方法名 (形参列表) {
            方法体代码(执行方法功能的代码);
            return 返回值; (无返回值可省略且必须省略)
        }
    方法调用:
        方法定义后并不是直接运行的, 需要手动调用才能执行
        调用格式:
            方法名(参数);
        注意: 如果方法存在返回值, 需要有变量接收方法返回的数据, 返回值代表方法运行的最终结果！！
    定义方法两个明确:
        1. 明确返回值类型: 明确方法执行完毕后是否有数据返回, 以及确认返回数据类型
        2. 明确参数: 确定需传入形参的类型和参数个数
    方法的重载:
        在一个类中, 定义了多个同名方法, 这些方法的参数个数和参数类型互不相同
 */

public class $1_MethodSummarize {
    public static void main(String[] args) {
//        int sum = methodDemo3(5, 10);
//        System.out.println(sum);
        boolean bl = compareInt(1L, 2L);
        System.out.println(bl);
    }
    
    public static void methodDemo1 () {
        // 无参数无返回值方法定义
        System.out.println("这是一个方法, 无参数, 也无返回值。。。");
    }
    
    public static void methodDemo2 (int num1,int num2) {
        // 有参数无返回值方法定义
        int sum = 0;
        sum = num1 + num2;
        System.out.println(sum);
    }
    
    public static int methodDemo3 (int num1, int num2) {
        // 带参数带返回值方法定义
        int sum = 0;
        sum = num1 + num2;
        return sum;
    }
    
    /*
        方法重载练习:
            需求: 比较两个整数是否相同, 要求兼容所有的整数类型
     */
    public static boolean compareInt(byte num1, byte num2) {
        System.out.println("byte");
        if (num1 == num2) {
            return true;
        } else {
            return false;
        }
    }
    
    public static boolean compareInt(int num1, int num2) {
        System.out.println("int");
        if (num1 == num2) {
            return true;
        } else {
            return false;
        }
    }
    
    public static boolean compareInt(short num1, short num2) {
        System.out.println("short");
        if (num1 == num2) {
            return true;
        } else {
            return false;
        }
    }
    
    public static boolean compareInt(long num1, long num2) {
        System.out.println("long");
        if (num1 == num2) {
            return true;
        } else {
            return false;
        }
    }
}

