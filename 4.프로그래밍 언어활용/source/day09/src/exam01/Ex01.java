package exam01;

import java.util.Random;

public class Ex01 {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i =0;i<6; i++){
            int num = random.nextInt();
            System.out.println(num);

            boolean bool = random.nextBoolean();
            System.out.println(bool);
        }
    }
}
