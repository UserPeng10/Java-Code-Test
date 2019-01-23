package peng.day10.practiceInterface;

/*
1.接口的默认方法，可以通过接口实现类对象，直接调用。
2.接口的默认方法，也可以被接口的实现类尽心覆盖重写。
*/
public class PracticeInterface02 {

    public static void main(String[] args) {
        //创建了实现类对象
        MyInterfaceDefaultA myInterfaceDefaultA = new MyInterfaceDefaultA();
        myInterfaceDefaultA.methodAbs();

        //调用默认方法，如果实现类没有，会向上找接口
        myInterfaceDefaultA.methodDefualt();//新添加的默认方法
        System.out.println("=============");

        MyInterfaceDefaultB myInterfaceDefaultB = new MyInterfaceDefaultB();
        myInterfaceDefaultB.methodAbs();
        myInterfaceDefaultB.methodDefualt();//实现类B覆盖重写了接口的默认方法
    }

}
