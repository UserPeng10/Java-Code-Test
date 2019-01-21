package peng.day09.Test;

import java.util.ArrayList;

//群主的类
public class Manager extends User {

    public Manager() {
    }

    public Manager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int totalMonay,int count){
        //需要一个集合，用来存储若干个红包的金额
        ArrayList<Integer> redlist = new ArrayList<>();

        //首先看一下群主自己余额
        int leftMoney = super.getMoney();

        if (totalMonay > leftMoney){
            System.out.println("余额不足!");
            return redlist;//返回空集合
        }

        //扣钱：重新设置余额
        super.setMoney(leftMoney - totalMonay);

        //发红包需要平均拆分成count份
        int avg = totalMonay / count;
        int mod = totalMonay % count;

        //除不开的的零头，包在最后一个红包当中
        //下面把一个个红包放在集合当中
        for (int i = 0; i < count-1; i++) {
            redlist.add(avg);
        }

        int last = avg + mod;
        redlist.add(last);

        return redlist;
    }

}
