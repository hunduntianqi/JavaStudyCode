package javabasic.l_face_object_advanced;

/*
    权限修饰符:
        是用来控制一个成员能够被访问的范围的
        可以修饰成员变量, 方法, 构造方法, 内部类
        四种权限修饰符作用范围:
            private < default < protected < public
            private: 同一个类中可访问
            default: 同一个类和同一个包中的其他类可访问
            protected: 同一个类, 同一个包下的其他类, 不同包下的子类可访问
            public: 访问无限制
        使用规则:
            实际开发中, 一般只用private和public
            1. 成员变量 ==> private
            2. 方法 ==> public
                特例: 如果方法中的代码是抽取其他方法中的共性代码, 这个方法一般也私有
    代码块 ==> {}:
        1. 局部代码块:
            定义在方法内部的代码块, 可以提前结束变量的生命周期(已淘汰)
        2. 构造代码块:
            定义在类中方法外的代码块, 在创建对象时, 会先于构造方法执行(不够灵活)
        3. 静态代码块:
            格式: static {}
            特点:需要使用static关键字进行修饰, 随着类的加载而加载, 并且自动触发, 只执行一次
            使用场景: 在类加载时, 需要做一些数据初始化时使用(重点)
 */

public class $5_PermissionModifierAndCodeBlock {
}
