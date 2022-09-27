package javabasic.l_face_object_advanced;

/*
    接口:
        接口是一种规则, 是对行为的抽象
        接口定义:
            public interface 接口名 {}
            注意: 接口不能实例化
        接口和类之间是实现的关系, 通过implements关键字表示:
            public class 类名 implements 接口名 {}
        接口的子类(实现类):
            1. 要么重写接口中的所有抽象方法
            2. 要么实现类是抽象类
        注意:
            1. 接口和类之间可以单实现, 也可以多实现:
                public class 类名 implements 接口1, 接口2, ... {}
            2. 实现类可以在继承一个类的同时实现多个接口:
                public class 类名 extends 父类 implements 接口1, 接口2, ...{}
    接口中的成员:
        成员变量: 只能是常量, 默认修饰符为 ==> public static final
        构造方法: 接口没有构造方法
        成员方法:
            JDK7以前:
                只能定义抽象方法, 默认修饰符为public abstract
            JDK8开始:
                接口中可以定义有方法体的方法
            JDK9开始:
                接口中可以定义私有方法
        类和类之间的关系:
            继承关系, 只能单继承, 不能多继承
        类和接口的关系:
            实现关系, 可以单实现, 也可以多实现, 还可以在继承一个类时实现多个接口
        接口和接口的关系:
            是继承关系, 可以单继承, 也可以多继承, 当实现类实现子接口时, 需要重写包括父接口在内的所有抽象方法
    JDK8以后接口新增方法:
        1. 允许在接口定义默认方法, 需要使用关键字default修饰
            作用: 解决接口升级的问题
            定义格式:
                public default 返回值类型 方法名() {}
            注意事项:
                a. 默认方法不是抽象方法, 所以不强制被重写; 但是如果被重写, 重写时需要去掉default关键字
                b. public 可以省略, default 不能省略
                c. 如果实现了多个接口, 多个接口中存在相同名字的默认方法, 实现类就必须对该方法进行重写
        2. 允许接口中定义静态方法, 需要用static修饰
            定义格式:
                public static 返回值类型 方法名 (参数列表) {}
            注意事项:
                a. 静态方法只能通过接口名调用, 不能通过实现类名或者对象名调用
                b. public 可以省略, static 不能省略
    JDK9以后接口新增方法:
        允许接口中定义私有方法:
            格式1:普通私有方法 ==> 为默认方法服务
                private 返回值类型 方法名 (参数列表) {}
            格式2:静态私有方法 ==> 为静态方法服务
                private static 返回值类型 方法名 (参数列表) {}
 */

public class $7_Interface {
}
