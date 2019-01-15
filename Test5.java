//private 实现封装
class Person{
    private String  name;
    private int age;
    public void setName(String n){
        name = n;
    }
    public String getName() {
        return name;
    }

    public void setAge(int i) {
       age = i;
    }

    public int getAge() {
        return age;
    }
    public void getPersonInfo(){
        System.out.println("姓名:"+name+"\t"+"年龄:"+age);
    }
}
public class Test5 {
    public static void main(String[] args){
        Person per = new Person();
        per.setName("赵钱孙");
        per.setAge(18);
        per.getPersonInfo();
    }
}
//类的设计原则：编写类时，类中的所有属性必须使用private封装；
//              属性若要被外部访问，必须定义setter、getter方法


//构造方法：使用关键字new实例化对象时来进行调用的操作方法
//使用构造方法设置对象属性
class Person{
    private String name;
    private int age;
    public Person(String n,int i){
        name = n;
        age = i;
    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setAge(int i) {
        age = i;
    }

    public int getAge() {
        return age;
    }
    public void getPersonInfo(){
        System.out.println("姓名："+name+"\t"+"年龄："+ age);
    }
}

public class Test5{

    public static void main(String[] args){
        Person per = new Person("赵钱孙",18);
        per.getPersonInfo();
        //new Person("赵钱孙",18).getPersonInfo();//匿名对象
    }
}
