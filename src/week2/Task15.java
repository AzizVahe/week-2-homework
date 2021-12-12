package week2;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n < 0) {
            n = -n;
        }
        int power1 = 1;
        int power2 = 2;
        System.out.println(power1);
        while (power2 <= n) {
            power1 = power2;
            power2 = power2 * 2;
            if(power1 > n){
                break;
            }
            System.out.println(power1);
        }
    }
}
