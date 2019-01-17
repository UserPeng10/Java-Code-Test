package peng.day05.practiceRandom;

import java.util.Random;

/*
Random类用来生成随机数字，使用时有三个步骤：

1.导包
import java.util.Random

2.创建
Random ran = new Random();//小括号当中留空即可

3.使用
获取一个随机的int数字(范围是int所有范围，有正负两种)：int num = ran.nextInt();

获取一个随机的int数字(参数代表了范围，左闭右开区间):int num = ran.nextInt(3)
实际上代表的含义是：[0,3),也就是0~2
*/
public class PracticeRandom01 {

    public static void main(String[] args) {
        Random ran = new Random();
        int num = ran.nextInt();
        System.out.println("随机数是："+num);

    }
}
