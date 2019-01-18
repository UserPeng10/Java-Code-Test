package peng.day06.practiceString;

/*
String当中常用方法：

public int length():获取字符串当中含有的字符个数，拿到字符串长度。
public String concat(String str):将当前字符串和参数字符串拼接成返回值新的字符串。
public char charAt(int index):获取指定索引位置的单个字符。（索引从0开始）
public int indexOf(String str):查找参数字符串在本字符串当中出现的索引位置，如果没有返回—1。
*/
public class StringGet {

    public static void main(String[] args) {
        //获取字符串长度
        int length = "qwertyuiop".length();
        System.out.println("字符串长度：" + length);
        System.out.println("===============");

        //拼接字符串：
        String str1 = "Hello ";
        String str2 = "World!";
        String str3 = str1.concat(str2);
        System.out.println(str1);//Hello 不变
        System.out.println(str2);//World!不变
        System.out.println(str3);//Hello World!
        System.out.println("===================");

        //获取指定索引位置的单个字符
        String str4="Hello Java!";
        char c = str4.charAt(6);
        System.out.println("在6号索引位置的字符是："+c);
        System.out.println("====================");

        //查找参数字符串在本来字符串当中出现的第一次索引位置
        String original ="HelloJava";
        int e = original.indexOf("llo");
        System.out.println("第一次出现的索引位置是："+e);//2

        System.out.println("HelloWorld".indexOf("abc"));//-1
    }

}
