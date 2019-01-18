package peng.day06.practiceArrayList;

import java.util.ArrayList;
//打印集合方法
/*
题目：
    定义以指定格式打印集合的方法（Arraylist类型作为参数），使用{}扩起集合，使用@分隔每个元素。
    即：{ 元素 @ 元素 @ 元素 }。

System.out.println(list);       [10, 20, 30]
自定义：printArrayList(list);    {10@20@30}

*/
public class ArrayListTest2 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        System.out.println(list);//[张三, 李四, 王五]
        System.out.println("==================");
        printArrayList(list);
    }

    public static void printArrayList(ArrayList<String> list){
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            if(i == list.size()-1){
                System.out.print(list.get(i)+"}");
            }else {
                System.out.print(list.get(i)+"@");
            }
        }
    }

}
