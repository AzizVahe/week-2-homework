package week2;

import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int div = 1;
        while (div <= x) {
            if (x % div == 0) {
                System.out.println(div);
                break;
            }
            x++;
        }
    }
}
