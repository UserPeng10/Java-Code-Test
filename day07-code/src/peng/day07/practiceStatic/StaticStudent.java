package peng.day07.practiceStatic;

public class StaticStudent {

    public static void main(String[] args) {
        Student.room = "101";

        Student one = new Student("小虎", 18);
        System.out.println("姓名："+one.getName());
        System.out.println("年龄："+one.getAge());
        System.out.println("教室："+Student.room);
        System.out.println("==================");

        Student two = new Student("小兰", 18);
        System.out.println("姓名："+two.getName());
        System.out.println("年龄："+two.getAge());
        System.out.println("教室："+Student.room);
    }

}
