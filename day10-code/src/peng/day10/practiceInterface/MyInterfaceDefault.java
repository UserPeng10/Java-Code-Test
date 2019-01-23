package peng.day10.practiceInterface;

/*
从Java 8开始，接口里允许定义默认方法。
格式：
public default 返回值类型  方法名称（参数列表）{
    //方法体
}

备注：接口当中的默认方法，可以解决接口升级的问题。
*/
public interface MyInterfaceDefault {

    //抽象方法
    public abstract void methodAbs();

    //新添加的一个抽象方法
//    public abstract void methodAbs2();

    //新添加的方法改成默认方法
    public default void methodDefualt(){
        System.out.println("新添加的默认方法 ");
    }
}
