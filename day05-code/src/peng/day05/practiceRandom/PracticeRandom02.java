package peng.day05.practiceRandom;

import java.util.Random;

public class PracticeRandom02 {

    public static void main(String[] args) {
        Random ran = new Random();

        for (int i = 0; i < 100; i++) {
            int num = ran.nextInt(10);
            System.out.print(num+"\t");
        }
    }

}
