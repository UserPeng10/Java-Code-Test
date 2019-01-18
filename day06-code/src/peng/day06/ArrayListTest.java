package peng.day06;

import java.util.ArrayList;
//对象添加到集合
/*
题目：
自定义4个学生对象，添加到集合，并遍历

思路：
1.自定义Student学生类，四个部分。
2.创建一个集合用来存储学生对象。泛型：<Student>
3.根据类来创建4个学生对象。
4.将四个学生对象添加到集合当中。add
5.遍历集合。
*/
class Student{
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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

public class ArrayListTest {

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student stu1 = new Student("郭靖",42);
        Student stu2 = new Student("黄蓉",40);
        Student stu3 = new Student("杨过",18);
        Student stu4 = new Student("小龙女",26);
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        list.add(stu4);
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println("姓名："+stu.getName()+",年龄："+stu.getAge());
        }
    }

}
