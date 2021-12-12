package week2;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int power = 1;
        while (power * 2 < n) {
            power *= 2;
            System.out.println(power);
        }
    }
}
