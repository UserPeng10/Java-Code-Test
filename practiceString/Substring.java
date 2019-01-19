package peng.day06.practiceString;

/*
字符串的截取方法：

public String substring(int index):截取从参数位置一直到字符串末尾，返回新字符串。
public String substring(int begin,int end):截取一个范围，从begin开始一直到end结束。
备注[begin,end),包含左边，不包含右边；

*/
public class Substring {

    public static void main(String[] args) {
        String str1 = "HelloWorld";

        String str2 = str1.substring(5);
        String str3 = str1.substring(5, 9);
        System.out.println(str1);//HelloWorld 字符串不能发生改变
        System.out.println(str2);//World 新字符串
        System.out.println(str3);//Worl 新字符串


        //下面这种写法，字符串的内容仍然是没有改变的
        //下面有两个字符串:"Hello","Java"
        //strA当中保存的是地址值
        //本来地址值是Hello的，后来变成了Java的
        String strA = "Hello";
        System.out.println(strA);//Hello
        strA = "Java";
        System.out.println(strA);//Java
    }

}
