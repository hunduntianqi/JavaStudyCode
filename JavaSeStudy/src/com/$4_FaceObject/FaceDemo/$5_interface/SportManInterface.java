package com.$4_FaceObject.FaceDemo.$5_interface;

public interface SportManInterface {
    // 接口中的成员, jdk1.8之前只有常量和抽象方法
    // 1.静态变量
    // public static final String SCHOOL_NAME = "黑马";
    String SCHOOL_NAME = "黑马";
    //2.抽象方法
    public abstract void run() ;
    
    public abstract void eat();
    
    
    /**
     * 从JDK8开始:
     *默认方法(实例方法)
     *类似普通实例方法, 必须用default修饰(默认会用public修饰), 默认方法需要通过接口实现类的对象调用
     */
    default void pao() {
        // 接口默认方法可以访问接口私有方法
        go();
        System.out.println("跑的很快~~~");
    }
    
    /**
     *  静态方法:
     *      必须用static修饰, 默认会使用public修饰
     *      注意:接口的静态方法必须用本身的接口名调用
     */
    static void inAddr() {
        System.out.println("在快乐的学习中~~~");
    }
    
    /**
     *  私有方法
     *  必须使用private修饰(JDK1.9版本开始有)
     * 只能在本类中被其他的默认方法或者私有方法访问
     */
    private void go() {
        System.out.println("准备好了！！");
    }
}
