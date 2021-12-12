package week2;

import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int count = 0;
        for (int div = 1; div <= x; div++) {
            if (x % div == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
