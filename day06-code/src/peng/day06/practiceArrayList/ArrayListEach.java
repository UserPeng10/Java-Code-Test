package peng.day06.practiceArrayList;

import java.util.ArrayList;

public class ArrayListEach {

    public static void main(String[] args) {
        ArrayList<String > list = new ArrayList<>();
        list.add("小虎");
        list.add("小兰");
        list.add("小龙");

        //遍历集合：
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

}
