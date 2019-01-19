package peng.day06.practiceString;

import java.util.Scanner;

/*
题目：
    键盘输入一个字符串，并且统计各种自负出现的次数。
    种类有：大写字母、小写字母、数字、其他

思路：
1.键盘输入用到Scanner
2.键盘输入的是字符串，那么：String str = sc.next();
3.需要定义四个变量，分别代表四种字符各自出现的次数。
4.需要对字符串进行挨个检查，String --> char[],方法toCharArray()
5.遍历char[]字符数组，对当前字符的种类进行判断，并且用四个变量进行++动作
6.打印输出四个变量，分别代表四中字符出现次数。
*/
public class StringTest2 {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sca.next();//获取键盘输入的字符串

        int countUpper = 0;//大写
        int countLower = 0;//小写
        int countNumber = 0;//数字
        int countOther = 0;//其他

        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            if ('A' <= ch && ch <= 'Z') {
                countUpper++;
            } else if ('a' <= ch && ch <= 'z') {
                countLower++;
            } else if ('0' <= ch && ch <= '9') {
                countNumber++;
            } else {
                countOther++;
            }
        }
        System.out.println("大写字母出现的次数是："+countUpper);
        System.out.println("小写字母出现的次数是："+countLower);
        System.out.println("数字字符出现的次数是："+countNumber);
        System.out.println("其他字符出现的次数是："+countOther);
    }

}
