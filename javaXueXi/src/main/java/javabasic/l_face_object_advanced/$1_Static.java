package javabasic.l_face_object_advanced;

/*
    static:
        表示静态的意思, 可以修饰成员变量, 表示该变量在内存中只储存一份, 可以被共享访问, 修改
        静态成员变量:指有static修饰的成员变量, 不属于对象, 属于类; 被该类的所有对象共享; 随着
                    类的加载而加载, 优先于对象存在
            访问静态成员变量:
                1.通过类名访问:类名.静态成员变量(推荐使用)
                2.通过对象访问:对象.静态成员变量(不推荐使用)
        实例成员变量:无static修饰, 存在于每个对象中, 属于每个对象的信息
            访问实例成员变量:
                对象.实例成员变量
        成员方法:
            1.静态成员方法:有static修饰, 属于类, 建议用类名访问, 也可以使用对象访问
                特点: 多用在测试类和工具类中, 在JavaBean类中很少会用
                工具类:
                    帮助我们做一些事情, 但是不描述任何事物的类
                    要求:
                        1. 类名见名知意
                        2. 私有化构造方法
                        3. 方法定义为静态方法
                使用场景:
                    以执行一个通用功能为目的, 或者需要方便访问, 该方法可以定义为静态方法
            2.实例成员方法:无static修饰, 属于对象, 只能通过对象访问
                使用场景:
                    表示对象自己的行为, 方法中需要访问实例成员的, 该方法要定义为实例方法
    static关键字注意事项（面试常考）:
        1. 静态方法只能访问静态成员, 不可以直接访问实例成员（静态方法访问实例成员, 需要创建对象, 通过对象访问实例方法和实例成员）
        2. 实例方法可以访问静态的成员, 也可以访问实例成员
        3. 静态方法中是不可以出现this关键字的
    static应用知识:
        1.代码块:
            类的5大成分之一(成员变量, 构造器, 成员方法, 代码块, 内部类), 定义在类中方法外
            1.1 静态代码块:
                格式: static{}
                特点:需要通过static 关键字修饰, 随着类的加载而加载, 并自动触发, 只执行一次
                使用场景:在类加载时做一些静态初始化的操作, 以便后续使用
            1.2 构造代码块:
                格式:{}
                特点:每次创建对象时, 调用构造器执行时, 都会执行该代码块中的代码,并且在构造器执行前执行
                使用场景:初始化实例资源
    重新认识main()方法:
        public static void main (String[] args) {}
        public: 权限修饰符, 被JVM调用, 需要最大的访问权限
        static: 被JVM调用, 不用创建对象, 直接类名访问; 因为main方法是静态的, 所以用于测试的其他方法也需要是静态的
        void: main方法被JVM调用, 因此不需要返回值
        main: 一个通用的名称, 可以被JVM识别
        String[] args: 以前用于接收键盘录入数据的, 现在没用, 之所以保留是为了向下兼容
 */

public class $1_Static {
}
