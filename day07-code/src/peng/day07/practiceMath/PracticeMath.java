package peng.day07.practiceMath;

/*
java.util.Math类是数学相关的工具类，里面提供了大量的静态方法，完成与数学运算相关的操作。

public static double abs(double num):获取绝对值
public static double ceil(double num):向上取整（12.9-->13.0）
public static double floor(double num):向下取整（12.1-->12.0）不是四舍五入

public static long round(double num);四舍五入

Math.PI代表近似的圆周率常量（double）
*/
public class PracticeMath {

    public static void main(String[] args) {
        //获取绝对值
        System.out.println(Math.abs(3.14));//3.14
        System.out.println(Math.abs(0));//0
        System.out.println(Math.abs(-10));//10
        System.out.println("=================");

        //行上取整
        System.out.println(Math.ceil(12.1));//13.0
        System.out.println(Math.ceil(12.0));//12.0
        System.out.println("=================");

        //向下取整
        System.out.println(Math.floor(12.9));//12.0
        System.out.println("=================");

        //四舍五入
        System.out.println(Math.round(4.5));//5
        System.out.println(Math.round(4.4));//4

    }

}
