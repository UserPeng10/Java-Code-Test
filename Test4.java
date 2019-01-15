数组部分拷贝 System.arraycopy(源数组，源数组开始点，目标数组，目标数组开始点，拷贝长度)
public class Test4 {

    public static void main(String[] args) {
        int[] dataA = new int[]{12, 324, 123, 13, 55, 23};
        int[] dataB = new int[]{2143, 12, 54, 21, 4, 43,};
        System.arraycopy(dataA, 2, dataB, 3, 3);
        printArray(dataB);
    }

    public static void printArray(int[] temp) {
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + "\t");
        }
    }
}
//完全拷贝，可以实现数组的扩容
public class Test4{

    public static void main(String[] args){
        int[] original = new int[]{1,2,4,4,5,2};
        int[] result =java.util.Arrays.copyOf(original,10);
        for (int temp : result){//（增强循环）（变量类型 变量名 ： 变量对象）
            System.out.print(temp+"\t");
        }
    }
}

//数据处理
//给定一个数组计算该数组的最大值、最小值、总和、平均值：
//通过数组与方法的相互操作来实现
public class Test4{

    public static void main(String[] args){
        processData(new int[]{1,43,45,12,654,23425,345,31,553});
    }//简化主方法中的代码，主方法相当于客户端调用，里面代码越简单越好
    public static void processData(int[] temp){
        double[] result = new double[4];
        result[0]=temp[0];//max
        result[1]=temp[0];//min
        result[2]=temp[0];//sum
        result[3]=temp[0];//avg
        for (int i=0;i<temp.length;i++){
            result[2]+=temp[i];
            if(result[0]<temp[i]){
                result[0]=temp[i];
            }
            if (result[1]>temp[i]){
                result[1]=temp[i];
            }
        }
        result[3]=result[2]/temp.length;
        System.out.println("最大值为："+result[0]);
        System.out.println("最小值为："+result[1]);
        System.out.println("总和为："+result[2]);
        System.out.println("平均值为："+result[3]);
    }
}

对象数组：就是指包含了一组相关的对象，但是在对象数组的使用中一定要清楚一点：数组一定要先开辟空间，
但是因为其是引用数据类型，所以数组里面的每一个对象都是null值，则在使用的时候数组中的每一个对象必须分别进行实例化操作。
对象数组的声明
1.先定义，再开辟空间
类名称 对象数组名[] = null;
对象数组名 = new 类名称[长度]；
2.定义并开辟
类名称 对象数组名[] = new 类名称[长度]；
在声明对象数组后，必须对每个数组成员进行实例化才能使用，负责会报空指针异常！
动态初始化：先声明数组，然后对数组的每个对象进行实例化操作。
class Person{
    private String name;
    private int age;
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void getInfo(){
        System.out.println("姓名："+this.name+"\t"+"年龄："+this.age);
    }
}
public class Test4{

    public static void main(String[] args){
    Person[] per = new Person[3];//声明一个对象数组，有三个对象
    per[0] = new Person("小龙",18);
    per[1] = new Person("小虎",18);
    per[2] = new Person("小兰",18);
    for (int i=0;i<per.length;i++){
        per[i].getInfo();
    }
    }
}

静态初始化
类名称 对象数组名[] = new 类名称[]{对象,对象...}
class  Person{
    private String name;
    private int age;
    public Person(String name,int age){
        this.age=age;
        this.name=name;
    }
    public void getInfo(){
        System.out.println("姓名："+this.name+"\t"+"年龄"+this.age);
    }
}
public class Test4{

    public static void main(String[] args){
        Person[] per = new Person[]{
                new Person("小龙",18),
                new Person("小虎",18),
                new Person("小兰",18)
        };//对象数组静态初始化
        for (int i=0;i<per.length;i++){
            per[i].getInfo();
        }
    }
}