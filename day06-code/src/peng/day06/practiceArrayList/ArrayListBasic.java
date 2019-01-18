package peng.day06.practiceArrayList;

import java.util.ArrayList;
/*
如果向集合ArrayList当中存储基本类型数据，必须使用基本类型对应的“包装类”。

基本类型        包装类（引用类型，包装类都位于java.long包下）
byte        Byte
short       Short
int         Integer     【特殊】
long        Long
float       Float
double      Double
char        Character   【特殊】
boolean     Boolean

从JDk1.5+开始，支持自动装箱，自动拆箱。

自动装箱：基本类型 --> 包装类型
自动拆箱：包装类型 --> 基本类型
*/
public class ArrayListBasic {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        //错误写法！泛型只能是引用类型，不能是基本类型。
        //ArrayList<int> list1 = new ArrayList<>();

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(200);
        System.out.println(list2);

        int num = list2.get(0);
        System.out.println("第0号元素是："+num);

    }

}
