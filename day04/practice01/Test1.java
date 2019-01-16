package peng.day04.practice01;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/*
面向对象三大特征：封装 继承 多态

封装在Java中的体现
1.方法就是一种封装
2.关键字private也是一种封装

封装就是将一些细节信息隐藏起来，对于外界不可见。
 */
public class Test1 {
    public static void main(String[] args) {
        int[] array = new int[]{23,42,123,43,45};
        int max = getMax(array);
        System.out.println("最大值:"+max);
    }
    
    public static int getMax(int[] temp){
        int max = temp[0];
        for (int i = 0; i < temp.length; i++) {
            if (max < temp[i]){
                max = temp[i];
            }
        }
        return max;
    }
}
