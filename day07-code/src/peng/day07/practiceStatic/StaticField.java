package peng.day07.practiceStatic;
/*
如果一个成员变量使用了static关键字，那么这个变量不在属于对象自己，而是属于所在的类。多个对象共享同一份数据。
*/

class Student {

    private int id;
    private String name;
    private int age;
    static String room;//静态变量
    private static int idCounter = 0;//学号计数器，每当new了一个新对象的时候，计数器加1

    public Student() {
        this.id = ++idCounter;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = ++idCounter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class StaticField {

    public static void main(String[] args) {
        Student one = new Student("小虎", 18);
        one.room = "101";
        Student two = new Student("小兰", 18);

        System.out.println("姓名：" + one.getName()
                + ",年龄：" + one.getAge() + ",教室:" +Student.room
                + ",学号:" + one.getId());
        System.out.println("姓名：" + two.getName()
                + ",年龄：" + two.getAge() + ",教室:" +Student.room
                + ",学号:" + two.getId());
    }

}
