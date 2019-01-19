package peng.day06.practiceString;

/*
题目：
    定义一个方法，把一个数组{1,2,3}按照指定格式拼接成一个字符串。[word1#word2#ord3]
*/
public class StringTest1 {

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3};
        System.out.println(fromArrayToString(array));
    }

    public static String fromArrayToString(int[] array) {
        String str = "[";
        for (int i = 0; i < array.length; i++) {
            if (i == array.length-1) {
                str += "word" + array[i] + "]";
            }else{
                str += "word" + array[i] + "#";
            }
        }
        return str;
    }

}
