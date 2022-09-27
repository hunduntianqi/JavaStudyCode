package javabasic.d_operational_character;

/*
    运算符和表达式:
        运算符: 对字面量或变量进行操作的符号
        表达式: 通过运算符将字面量或变量连接, 符合Java语法的式子
    运算符分类:
        算数运算符, 自增自减运算符, 赋值运算符, 关系运算符, 逻辑运算符, 三元运算符
    隐式转换(自动类型提升):
        取值范围小的数据转换为取值范围大的数据
        取值范围:
            byte < short < int < long < float < double
        两种提升规则:
            a. 取值范围小的和取值范围大的数据进行运算, 取值范围小的数据会先转换为取值范围大的数据, 再进行运算
            b. byte / short / char 类型的数据, 在运算的时候都会直接提升为 int , 再进行运算
    强制转换:
        取值范围大的数据转换为取值范围小的数据, 不能直接转换, 需要用到强制转换
        格式:
            目标数据类型 变量名 = (目标数据类型) 被强制转换的数据;
    算数运算符:
        加: +
            a. 当 "+" 操作的表达式中出现字符串时, 最终数据类型为字符串
            b. 当"字符+字符" / "字符+数字"时, 会把字符转换为ASCII表的对应数字再计算(A~65, a~97)
        减: -
        乘: *
        除: /
        取模 / 取余: %
    自增自减运算符:
        ++: 加, 变量的值加一
        --: 减, 变量的值减一
        注意: ++和--可以放在变量前, 也可以放在变量后, 单独使用时无差别
            在参与运算时:
                变量++ / 变量--: 先赋值, 再自增或自减
                ++变量 / --变量: 先自增或自减, 再赋值
    赋值运算符:
        =: 赋值, 例: int a = 10; 将 10 赋值给 变量a
        +=: 加后赋值, 例: a += b, 将 a+b 的值赋值给 变量a
        -=: 减后赋值, 例: a -= b, 将 a-b 的值赋值给 变量a
        *=: 乘后赋值, 例: a *= b, 将 a*b 的值赋值给 变量a
        /=: 除后赋值, 例: a /= b, 将 a / b 的值赋值给 变量a
        %=: 取余后赋值, 例: a %= b, 将 a % b 的值赋值给 变量a
        注意: +=, -=, *=, /=, %= 运算符在参与运算时, 底层隐藏有强制数据类型转换,
            最终数据类型取决于要赋值变量的数据类型
    关系运算符:
        ==: 判断两个变量的值是否相等, 相等为true, 不相等为false
        !=: 判断两个变量的值是否不相等, 不相等为true, 相等为false
        >: a > b, 判断变量a的值是否大于变量b的值, 成立为true, 不成立为false
        >=: a >= b, 判断变量a的值是否大于或等于变量b的值, 成立为true, 不成立为false
        <: a < b, 判断变量a的值是否小于变量b的值, 成立为true, 不成立为false
        <=: a <= b, 判断变量a的值是否小于或等于变量b的值, 成立为true, 不成立为false
    逻辑运算符:
        &: 逻辑与, 运算符两边表达式结果均为真, 结果为真
        |: 逻辑或, 运算符两边表达式有一个为真, 结果为真; 两边均为假, 结果为假
        ^: 逻辑异或, 两边结果相同为false, 不同为true
        !: 逻辑非, 取反
    短路逻辑运算符:
        &&: 短路与, 结果与&相同, 但是有短路效果, 即: &&符号前的表达式如果为假, 则不在判断&&符号后面的表达式
        ||: 短路或, 结果与|相同, 但是有短路效果, 即: ||符号前的表达式如果为真, 则不在判断||符号后面的表达式
    三元运算符:
        格式:
            关系表达式 ? 表达式1 : 表达式2;
            根据关系表达式的逻辑判断结果, 选择不同的内容, 若为true, 结果为表达式1; 若为false, 结果为表达式2
 */

import java.util.Scanner;

public class $1_OperationalCharacter {
    public static void main(String[] args) {
        // arithmeticOperatorDemo();
        // incrementAndDecrementOperatorDemo();
        // logicOperatorDemo();
        ternaryOperator();
    }

    /* 算数运算符练习 */
    public static void arithmeticOperatorDemo() {
        // 键盘录入一个三位数, 将其拆分为个位, 十位和百位, 打印到控制台
        // 新建Scanner对象
        Scanner sc = new Scanner(System.in);
        // 定义变量接收数据
        System.out.println("请输入一个三位数: ");
        int num = sc.nextInt();
        // 拆分个位数
        int units = num % 10;
        // 拆分十位数
        int tens = num / 10 % 10;
        // 拆分百位数
        int hundreds = num / 100 % 10;
        // 打印输入百位, 十位, 个位数
        System.out.println("百位数是: " + hundreds + ", 十位数是: " + tens + ", 个位数是: " + units);
    }

    /* 自增自减运算符练习 */
    public static void incrementAndDecrementOperatorDemo() {
        // 定义变量记录数据
        int i = 0;
        // 定义变量记录自增或自减后数据
        int num = 0;
        // i++
        num = i++;
        // 输出 i++ 后两个变量的数据
        System.out.println("num = " + num + ", i = " + i);
        // i--
        num = i--;
        // 输出 i-- 后两个变量的数据
        System.out.println("num = " + num + ", i = " + i);
        // ++i
        num = ++i;
        // 输出 ++i 后两个变量的数据
        System.out.println("num = " + num + ", i = " + i);
        // --i
        num = --i;
        // 输出 --i 后两个变量的数据
        System.out.println("num = " + num + ", i = " + i);
    }

    /* 逻辑运算符练习 */
    public static void logicOperatorDemo() {
        // 1. &: 两边都为真, 结果为真
        System.out.println("----& 练习----");
        System.out.println(false & true); // false
        System.out.println(true & true); // true

        // 2. |: 两边都为假, 结果为假
        System.out.println("----| 练习----");
        System.out.println(false | true); // true
        System.out.println(false | false); // false

        // 3. ^: 相同为false, 不同为true
        System.out.println("----^ 练习----");
        System.out.println(false ^ true); // true
        System.out.println(false ^ false); // false
        System.out.println(true ^ true); // false
        System.out.println(true ^ false); // true

        // 4. !: 取反
        System.out.println("----! 练习----");
        System.out.println(!true); // false
        System.out.println(!false); // true
    }

    /* 三元运算符练习 */
    public static void ternaryOperator() {
        // 定义变量接收三元运算符运算结果
        int num;
        // 创建Scanner对象接受数据
        Scanner sc = new Scanner(System.in);
        // 定义变量接收数字1
        System.out.println("请输入数字1:");
        int num1 = sc.nextInt();
        // 定义变量接收数字2
        System.out.println("请输入数字2:");
        int num2 = sc.nextInt();
        num = num1 > num2 ? num1 : num2;
        System.out.println("最大值为: " + num);
    }
}
