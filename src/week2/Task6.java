package week2;

import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        Random random = new Random();
        int i = random.nextInt();
        if (i < 0){
            i = -i;
        }
        int a = 2 + (i % 6);

        System.out.println(a);
    }
}

