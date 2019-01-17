package peng.day05.practiceScanner;

import java.util.Scanner;

/*
题目：键盘输入三个数字，求出其中的最大值

思路：

1.键盘输入，需要用到Scanner；
2.Scanner三个步骤：导包、创建、使用
3.需要调用三次nexInt（）方法，得到三个int变量
4.求出三个数字里面最大的数字
5，将结果打印出来

*/
public class ScannerMax {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);

        System.out.println("请输入第一个数：");
        int a = sca.nextInt();
        System.out.println("请输入第二个数：");
        int b = sca.nextInt();
        System.out.println("请输入第三个数：");
        int c = sca.nextInt();

        int temp = numMax(a,b,c);
        System.out.println("最大值是："+temp);
    }

    public static int numMax(int a,int b,int c){
        int temp = a>b?a:b;
        int max = temp>c?temp:c;
        return max;
    }
}
