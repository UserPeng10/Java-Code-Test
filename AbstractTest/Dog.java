package peng.day09.AbstractTest;

//子类也是一个抽象类
public abstract class Dog extends Animal {

    @Override
    public void eat(){
        System.out.println("吃骨头!");
    }
    //public abstract void sleep();


}
