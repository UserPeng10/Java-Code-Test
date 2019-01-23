package peng.day10.practiceInterfacePrivate;

/*
问题描述：
需要抽取一个共有方法，用来解决两个默认方法之间重复代码的问题。
但是这个方法不应该让实现类使用，应该私有化的。

解决方法：
从Java9开始，接口当中允许定义私有方法。
1.普通私有方法，解决多个默认方法之间重复代码的问题。
格式:
private 返回值类型 方法名称（参数列表）{
    //方法体
}

2.静态使用方法，解决多个静态方法之间重复代码的问题。

格式：
private static 返回值类型 方法名称（参数列表）{
    //方法体
}
*/
public interface MyInterfacePrivateA {

    public default void methodDefault1(){
        System.out.println("默认方法1");
//        System.out.println("AAA");
//        System.out.println("BBB");
//        System.out.println("CCC");
       //methodCommon();
    }

    public default void methodDefault2(){
        System.out.println("默认方法2");
//        System.out.println("AAA");
//        System.out.println("BBB");
//        System.out.println("CCC");
        //methodCommon();
    }

    //下面代码没问题，由于装的是Java 8，所以会报错
//    private void methodCommon(){
//        System.out.println("AAA");
//        System.out.println("BBB");
//        System.out.println("CCC");
//    }

}
