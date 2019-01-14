public class Test3 {

    public static void main(String[] args){
        int[] x = new int[3];//数组动态初始化，有new出现就在堆上开辟新空间；数组是引用数据类型
        System.out.println(x.length);
        x[0]=1;
        x[1]=2;
        x[2]=3;
        for(int i=0;i<x.length;i++){
            System.out.println(x[i]);
        }
    }
}

//多个栈内存指向相同的堆内存：
public class Test3{

    public static void main(String[] args){
        int[]x=new int[3];
        int[]temp=new int[3];
        System.out.println(x.length);
        x[0]=1;
        x[1]=2;
        x[2]=3;
        for (int i=0;i<x.length;i++){
            System.out.print(x[i]+"\t");
        }
        System.out.println();
        temp=x;
        temp[0]=120;
        System.out.println(temp[0]);
    }
}

//数组静态初始化：
public class Test3 {

    public static void main(String[] args) {
        int[] x = new int[]{1, 2, 3};
        System.out.println(x.length);
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + "\t");
        }
    }
}

public class Test3{

    public static void main(String[] args){
        int[] data=new int[]{1,2,3,4};
        printArray(data);//方法接收数组
        bigger(data);//修改数组
    }
    public static void printArray(int[] temp){
        for (int i=0;i<temp.length;i++){
            System.out.print(temp[i]+"\t");
        }
        System.out.println();
    }
    public static void bigger(int[] temp){
        for (int i=0;i<temp.length;i++){
            temp[i]*=2;
            System.out.print(temp[i]+"\t");
        }
        System.out.println();
    }
}

//数组排序
public class Test3{

    public static void main(String[] args){
        int[] intData=new int[]{13,123,43,121,43};
        char[] charData=new char[]{'q','w','c','f'};
        java.util.Arrays.sort(intData);//对数组intData进行排序
        java.util.Arrays.sort(charData);//对数组charData进行排序
        printArray(intData);
        printArray(charData);
    }
    public static void printArray(int[] temp){
        for (int i=0;i<temp.length;i++){
            System.out.print(temp[i]+"\t");
        }
        System.out.println();
    }
    //用到重载：这里是参数类型不同
    public static void printArray(char[] temp){
        for(int i=0;i<temp.length;i++){
            System.out.print(temp[i]+"\t");
        }
    }
}