package peng.day07.practiceMath;
/*
题目：
计算在-10.8到5.9之间：绝对值大于6 或者小于2.1的整数有多少个？

分析：
1.范围确定：for循环
2，起点位置从-10.8 --> -10.0;
    2.1可以使用Math.ceil方法，向上（向正方向）取整
    2.2强制类型转换int，自动舍去所有小数位
3.每个数字都是整数，所以步进表达式：num++
4.拿到绝对值：Math.abs;
5.一旦发现一个数字，需要计数器++进行统计。
*/
public class MathTest {

    public static void main(String[] args) {
        double min=-10.8;
        double max=5.9;
        int count=0;
//        for(int i=(int)min;i<max;i++){
//            int abs = Math.abs(i);
//            if(abs>6||abs<2.1){
//                System.out.print(i+"\t");
//                count++;
//            }
//        }
        for (double i=min;i<max;i++){
            double ceil = Math.ceil(i);
            double abs = Math.abs(i);
            if (abs>6||abs<2.1){
                System.out.println(ceil);
                count++;
            }
        }
        System.out.println();
        System.out.println("总共有："+count);//9

    }

}
