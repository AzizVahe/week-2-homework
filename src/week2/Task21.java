package week2;

import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int d = scanner.nextInt();
        int num = 0;
        int count = 0;
        while (x != 0) {
            num = x % 10;
            if (d == num) {
                count++;
            }
            x /= 10;
        }
        System.out.println(count);

    }

}
