package peng.day06.practiceArrayList;

import java.util.ArrayList;

/*
ArrayList当中的常用方法有：

public boolean add(E e):向集合当中添加元素，参数的类型和泛型一致。
备注：对于ArrayList集合来说，add添加动作一定是成功的，所以返回值可用可不用。
但是对于其他集合来说，add添加动作不一定成功。

public E get(int index):从集合当中读取元素，参数是索引编号，返回值就是对应位置的元素。

public E remove(int index):从集合当中删除元素，参数是索引编号，返回值是被删除掉的元素。

public int size():获取集合的尺寸长度，返回值是集合中包含的元素个数。
*/
public class PracticeArrayList02 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);

        //向集合当中添加元素：
        boolean success = list.add("小龙");
        System.out.println(list);
        System.out.println("添加是否成功：" + success);//true

        list.add("小虎");
        list.add("小兰");
        list.add("天明");
        list.add("月儿");
        System.out.println(list);//[小龙, 小虎, 小兰, 天明, 月儿]

        //从集合中读取元素：
        String name = list.get(0);
        System.out.println("读取元素："+name);//[小龙, 小虎, 小兰]

        //从集合当中删除元素：
        String whoRemove = list.remove(2);
        System.out.println("删除的元素："+whoRemove);//小兰
        System.out.println("剩余元素："+list);//[小龙, 小虎, 天明, 月儿]

        //获取集合的尺寸长度：
        int n = list.size();
        System.out.println("集合的长度为："+n);
    }

}
