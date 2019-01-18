package peng.day06.practiceArrayList;

//获取集合方法

import java.util.ArrayList;
import java.util.Random;

/*
题目：
用一个大集合存入20个随机数字，然后删选其中的偶数元素，放到小集合当中；
要求使用定义的方法来实现。

*/
public class ArrayListTest3 {

    public static void main(String[] args) {
        ArrayList<Integer> bigList = new ArrayList<>();
        Random ran = new Random();
        for (int i = 0; i < 20; i++) {
            int getNum = ran.nextInt(100);
            bigList.add(getNum);
        }
        System.out.println("偶数共几个："+getSmallList(bigList).size());
        System.out.println(getSmallList(bigList));
    }

    //接收大集合参数，返回小集合结果
    public static ArrayList<Integer> getSmallList(ArrayList<Integer> bigList){
        ArrayList<Integer> smallList = new ArrayList<>();
        for (int i = 0; i < bigList.size(); i++) {
            int num = bigList.get(i);
            if ( 0 == num%2){
                smallList.add(num);
            }
        }
        return smallList;
    }

}
