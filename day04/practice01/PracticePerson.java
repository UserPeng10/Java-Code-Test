package peng.day04.practice01;

public class PracticePerson {

    public static void main(String[] args) {

        Person person = new Person();
        person.show();
        System.out.println("------------");

        person.name = "小龙";
//        person.age = 18;//直接访问private内容，错误写法！
        person.setAge(123);
        person.show();

    }

}
