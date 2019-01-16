package peng.day04.practiceThis;
/*
构造方法是专门用来创建对象的方法，当我们通过关键字new来创建对象时，其实就是在调用构造方法。
格式：
public 类名称（参数类型 参数名称）{
    方法体
}

注意事项:
1.构造方法的名称，必须和所在的类名称完全一样，大小写也一样。
2.构造方法不要写返回值类型，连void不要写。
3.构造方法不能return一个具体的返回值，即不能有return出现。
4.若果没有编写任何构造方法，那么编译器将会默认产生一个构造方法，没有参数，方法体 什么事情都不会做。
    public Student() {}
5.若果写了构造方法，那么将不会在默认产生。
6.构造方法也是可以进行重载的。
* */
public class Student {

    //成员变量
    private String name;
    private int age;

    //无参数的构造方法
    public Student(){
        System.out.println("无参构造方法执行了！");
    }

    //全参数的构造方法
    public Student(String name,int age){
        System.out.println("全参构造方法执行了！");
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
