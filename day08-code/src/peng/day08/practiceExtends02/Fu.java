package peng.day08.practiceExtends02;

public class Fu {

    int numFu = 10;
    int num = 100;

    public void methodFu(){
        //使用本类当中，不会向下找子类
        System.out.println(num);
    }

}
