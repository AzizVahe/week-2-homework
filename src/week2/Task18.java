package week2;

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int even = a;
        while (even >= a && even < b) {
            even++;
            if (even % 2 == 0) {
                System.out.println(even);
            }
        }

    }
}