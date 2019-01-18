package peng.day06.practiceArrayList;

import java.util.ArrayList;
import java.util.Random;
//数值添加到集合
/*
题目：
生产6个1~100之间的随机整数，添加到集合，并遍历集合。

思路：
1.需要存储6个数字，创建一个集合，<Integer>
2.产生随机数，需要Random
3.用循环6次产生6个随机数字；
4.循环内调用r.nextInt(100)+1;
5.把数字添加到集合中，add；
6.遍历集合
*/
public class ArrayListTest1 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random ran = new Random();
        for (int i = 0; i < 6; i++) {
            int getNum = ran.nextInt(100)+1;
            list.add(getNum);
//            for (int j = 0; j < list.size(); j++) {
//                System.out.print(list.get(j)+"\t");
//            }
//            System.out.println();
            System.out.print(list.get(i)+"\t");
        }

    }

}
