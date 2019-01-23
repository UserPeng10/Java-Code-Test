package peng.day10.practiceInterfacePrivate;

public class MyInterfacePrivateAImpl implements MyInterfacePrivateA{

    public void methodAnother(){
        //直接访问到了接口的默认方法，这样是错误的！
        //methodCommon();
    }

}
