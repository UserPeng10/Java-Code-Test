package peng.day08.pracitceExtends01;

/*
在继承的关系中，“子类就是一个父类”。即，子类可以被当作父类看待。
例如：父类是员工，子类是讲师，那么“讲师就一个员工”。关系：is-a。

定义父类的格式:(一个普通的类定义)
public class 父类名称{
    //......
}

定义子类的格式：
public class 子类名称 extends 父类名称{
    //...
}
*/
public class PracticeExtends {

    public static void main(String[] args) {
        //创建一个子类讲师的对象
        Teacher teacher = new Teacher();
        teacher.method();

        //创建另一个子类助教的对象
        Assistant assistant = new Assistant();
        assistant.method();

    }

}
