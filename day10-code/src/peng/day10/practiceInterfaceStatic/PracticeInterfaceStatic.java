package peng.day10.practiceInterfaceStatic;

/*
注意：
1. 不能通过接口实现类的对象来调用接口当中的静态方法
2.正确用法:通过接口名称直接调用其中的静态方法。
格式：
接口名称.静态方法（参数）；
*/
public class PracticeInterfaceStatic {

    public static void main(String[] args) {
//        MyInterfaceStaticImpl myInterfaceStatic = new MyInterfaceStaticImpl();

        //错误写法：
//        myInterfaceStatic.methodStatic();
        MyInterfaceStatic.methodStatic();
    }

}
