package week2;

import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int revers = 0;
        while (x != 0) {
            int remain = x % 10;
            revers = revers * 10 + remain;
            x = x / 10;
        }
        System.out.println(revers);
    }
}
