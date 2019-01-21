package peng.day09.Test;

import java.util.ArrayList;

public class MainRedPacket {

    public static void main(String[] args) {
        Manager manager = new Manager("群主",100);
        Member memberA = new Member("成员A",0);
        Member memberB = new Member("成员B",0);
        Member memberC = new Member("成员C",0);

        manager.show();
        memberA.show();
        memberB.show();
        memberC.show();
        System.out.println("===============");

        //群主发50块红包，分三个
        ArrayList<Integer> redlist = manager.send(50,3);
        //三个成员收红包
        memberA.receive(redlist);
        memberB.receive(redlist);
        memberC.receive(redlist);

        manager.show();//100-50=50
        //16,16,18
        memberA.show();
        memberB.show();
        memberC.show();
    }

}
