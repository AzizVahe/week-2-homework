package week2;

import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int reverse = 0;
        while (x > 0){
            reverse = reverse * 10 + x%10;
            x = x / 10;
        }
        System.out.println(reverse);
    }
}
