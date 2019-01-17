package peng.day05.practiceAnonymous;

import java.util.Scanner;

public class Anonymou02 {

    public static void main(String[] args) {

        //普通使用方式
       // Scanner sca = new Scanner(System.in);
        //int num = sca.nextInt();

        //匿名对象方式
        //int num = new Scanner(System.in).nextInt();
        //System.out.println("输入的是："+num);

        //适用一般方法传入参数
//        Scanner sca = new Scanner(System.in);
//        methodParam(sca);

        //使用匿名对象进行传参
       // methodParam(new Scanner(System.in));

        //使用匿名对象作为方法的返回值
        Scanner sca = methodReturn();
        int num = sca.nextInt();
        System.out.println("输入的是："+num);

    }

    public static void methodParam(Scanner sca){
        int num = sca.nextInt();
        System.out.println("输入的是："+num);
    }

    public static Scanner methodReturn(){
//        Scanner sca = new Scanner(System.in);
//        return sca;

        return new Scanner(System.in);
    }
}
