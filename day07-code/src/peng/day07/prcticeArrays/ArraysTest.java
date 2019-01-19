package peng.day07.prcticeArrays;

import java.util.Arrays;

/*
题目：
使用Arrays相关的API，将一个随机字符串中的所有字符升序排列，并且倒序打印：

*/
public class ArraysTest {

    public static void main(String[] args) {
        String str = "ewffafew432gkjangiugaur";

        //字符串 --> 数组，用toCharArray
        char[] chars = str.toCharArray();
        Arrays.sort(chars);//对字符数组进行升序排列

        //倒序遍历
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i]+" ");//w w u u r n k j i g g g f f f e e a a a 4 3 2
        }
    }

}
