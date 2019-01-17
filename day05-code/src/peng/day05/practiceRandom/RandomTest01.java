package peng.day05.practiceRandom;

import java.util.Random;
/*
题目要求：
根据int变量的值，来获取随机数字，范围是[1，n]，可以取到1也可以取到n。

思路：
1.定义一个变量n，随意赋值；
2.使用Random：导包，创建，使用；
3.如果写上10，那么就是0~9，然而要的是1~10，so：整体加1即可；
4.打印随机数字

*/
public class RandomTest01{

    public static void main(String[] args) {
        int n =4;
        Random ran = new Random();
        for (int i = 0; i < 100; i++) {
            int result = ran.nextInt(n)+1;//本来范围[0,n),整体+1后[1,n+1),即[1,n]
            System.out.println("结果是："+result);
        }

    }
}
