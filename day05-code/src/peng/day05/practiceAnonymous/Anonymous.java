package peng.day05.practiceAnonymous;
/*
创建对象的标准格式：
类名称 对象名 = new 类名称（）；

匿名对象就是只有右边的对象，没有左边的的名字和赋值运算。
new 类名称（）；

注意事项：匿名对象只能使用唯一的一次，下次再使用不得不创建一个新的对象。
由于匿名对象不会有任何的栈空间所指向，所以使用一次后就成为垃圾空间。

*/
public class Anonymous {

    public static void main(String[] args) {
        Person per = new Person();
        per.name="小虎";
        per.showName();
        System.out.println("==================");
        //匿名对象
        new Person().name="小龙";
        new Person().showName();//null

    }
}
