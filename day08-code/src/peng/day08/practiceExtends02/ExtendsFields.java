package peng.day08.practiceExtends02;
/*
在父子类的继承关系当中，如果成员变量重名，则创建子类对象时，访问规则：

直接通过子类对象访问成员变量：
    等号左边是谁就优先用谁，没有则向上找。
间接通过成员方法访问成员变量：
    该方法属于谁就优先用谁，没有则向上找。
*/
public class ExtendsFields {

    public static void main(String[] args) {
        Fu fu = new Fu();
        System.out.println(fu.numFu);//10
        System.out.println("================");

        Zi zi = new Zi();
        System.out.println(zi.numZi);//20
        System.out.println("================");

        //等号左边是谁就优先用谁
        System.out.println(zi.num);//优先子类，200
        System.out.println("================");

        //子类的方法，优先使用子类的，没有向上找
        zi.methodZi();//200

        //父类的方法
        zi.methodFu();//100
    }

}
