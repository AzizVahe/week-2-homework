package week2;

import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int num;
        for (; a < b; a++) {
            if (a % 2 == 0) {
                num = a;
                System.out.println(num);
            }
        }


    }
}
