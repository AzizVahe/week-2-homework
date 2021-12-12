package week2;

import java.util.Scanner;

public class Task24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        for (int div = 1; div <= x; div++) {
            if (x % div == 0) {
                System.out.println(div);
            }
        }
    }
}
