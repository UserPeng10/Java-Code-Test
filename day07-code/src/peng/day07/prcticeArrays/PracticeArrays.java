package peng.day07.prcticeArrays;

import java.util.Arrays;

/*
java.util.Arrays:是一个与数组相关的工具类，里面提供了大量的静态方法，用来实现数组常见的操作。

public static String toString(数组)：将参数数组变成字符串（按照默认格式：[元素1，元素2，元素3]）。
public static void sort(数组)：按照升序（从小到大）对数组的元素进行排序。

备注：
1.如果是数值，sort默认按照升序从小大到大
2.如果是字符串，sort默认按照字母升序
3.如果是自定义的类型，那么这个自定义类需要有Comparable或者Comparator接口的支持。
*/
public class PracticeArrays {

    public static void main(String[] args) {
        int[] intArray = {10, 20, 30};
        //将int数组按照默认格式变成字符串
        String inStr = Arrays.toString(intArray);
        System.out.println(inStr);//[10, 20, 30]

        int[] array1={21,321,23,5,46,56,675,32};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));//[5, 21, 23, 32, 46, 56, 321, 675]

        String[]strArray={"bbb","aaa","ccc"};
        Arrays.sort(strArray);
        System.out.println(Arrays.toString(strArray));//[aaa, bbb, ccc]
    }

}
