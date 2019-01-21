package peng.day09.Test;

import java.util.ArrayList;
import java.util.Random;

//普通成员
public class Member extends User {

    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
    }

    public void receive(ArrayList<Integer> list){
        //从多个红包当中随便抽取一个，给我自己
        //随机获取一个list集合当中的索引编号
        int index = new Random().nextInt(list.size());
        //根据索引从集合当中删除，并且得到被删除的红包给我自己
        int delat = list.remove(index);
        //当前成员本来有多少钱：
        int moeny = super.getMoney();
        //加法，并且重新设置回去
        super.setMoney(moeny + delat);
    }

}
