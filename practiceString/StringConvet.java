package peng.day06.practiceString;

/*
String当中与转换相关的常用方法有：

public char[] toCharArray():将当前字符串拆分成字符数组作为返回值。
public byte[] getBytes():获得当前字符串底层的字节数据。
public String replace(CharSequence oldString,CharSequence newString):
将所有出现的老字符串替换成新的字符串，返回新字符串
备注：CharSequence意思就是说可以接受字符串类型。
*/
public class StringConvet {

    public static void main(String[] args) {
        char[] chars = "HelloJava".toCharArray();
        byte[] bytes = "HelloJava".getBytes();
        System.out.println(chars[5]);//J
        System.out.println(bytes[5]);//74
        System.out.println("==============");

        String strA = "HelloWorld";
        String strB = strA.replace("o", "n");
        System.out.println(strB);////HellnWnrld
        System.out.println("=============");

        String long1 = "会不会玩呀！你大爷的！你大爷的！你大爷的！！！";
        String long2 = long1.replace("你大爷的", "****");
        System.out.println(long2);//会不会玩呀！****！****！****！！！
    }

}
