package peng.day07.practiceStatic;
/*
一旦使用static修饰成员方法，那么就成了静态方法。
静态方法不属于对象，而是属于类的。

如果没有static关键字，那么必须首先创建对象，然后通过对象才能使用它。
如果有了static关键字，那么不需要创建对象，直接就能通过类名称来使用它。

无论成员变量还是成员方法，如果有了static关键字修饰，都推荐使用类名称进行调用。
静态变量：类名称.静态变量
静态方法：类名称.静态方法()

注意事项：
1.静态只能直接访问静态，不能直接访问非静态。
原因：在内存当中先有的静态内容，后有的非静态内容。“后人知道先人，先人不知道后人”。
2.静态方法中不能有this。
原因：this代表当前对象，通过谁调用的方法，谁就是对象。
*/
class Myclass {

    int num;//成员变量
    static int numStatic;//静态变量

    //成员方法
    public void method(){
        System.out.println("普通的成员方法！");
        //成员方法可以访问成员变量
        System.out.println(num);
        //成员方法可以访问静态变量
        System.out.println(numStatic);
    }

    //静态方法
    public static void methodStatic(){
        System.out.println("静态方法");
        //静态方法可以访问静态变量
        System.out.println(numStatic);
        //静态方法不能直接访问非静态
        //System.out.println(num);

        //静态方法中不能使用this关键字
        //System.out.println(this);//错误写法
    }

}

public class StaticMethod{

    public static void main(String[] args) {
        Myclass obj=new Myclass();//首先创建对象
        obj.method();//然后才能使用没有static关键字的内容

        //对于静态方法来说，可以通过对象名来调用，也可以直接通过类名来调用
        //obj.methodStatic();//正确，不推荐，这种写法在编译后也会被javac翻译成“类名称.静态方法名”
        Myclass.methodStatic();//正确，推荐

        //对于本类当中的方法可以省略类名称
        //StaticMethod.myMethod();
        myMethod();
    }

    public static void myMethod(){
        System.out.println("自己的方法！");
    }
}
