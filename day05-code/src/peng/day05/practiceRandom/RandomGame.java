package peng.day05.practiceRandom;

import java.util.Random;
import java.util.Scanner;

/*
题目：用代码模拟猜数字小游戏

思路：
1.首先需要产生一个随机数字，并且一旦产生不在变化。用Random的nextInt方法。
2.需要键盘输入，用到Scanner
3.获取键盘输入的数字，用Scanner当中的nextInt方法
4.已经得到了两个数字，判断（if）
    如果大了，提示大了，重新输入；
    如果小了，提示小了，重新输入；
    如果猜对，游戏结束。
5.重试就是再来一次，循环次数不确定，用while（true）死循环。
*/
public class RandomGame {

    public static void main(String[] args) {
        Random ran = new Random();
        int randomNum = ran.nextInt(50) + 1;
        Scanner sca = new Scanner(System.in);

        //不限制次数猜数字
//        while (true){
//            System.out.println("请输入你猜测的数字：");
//            int guessNum = sca.nextInt();
//
//            if (guessNum > randomNum) {
//                System.out.println("猜大了！请重新输入：");
//            } else if (guessNum < randomNum) {
//                System.out.println("猜小了！请重新输入：");
//            } else {
//                System.out.println("恭喜猜对！");
//                break;
//            }
//        }

        //限制次数猜数字
        for (int i = 0; i < 5; i++) {
            System.out.println("请输入你猜测的数字：");
            int guessNum = sca.nextInt();

            if (guessNum > randomNum) {
                System.out.println("猜大了！请重新输入：");
            } else if (guessNum < randomNum) {
                System.out.println("猜小了！请重新输入：");
            } else {
                System.out.println("恭喜猜对！");
                //
            }
        }
        System.out.println("游戏结束！");
    }
}
