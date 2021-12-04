package week2;

import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        while (a < b){
            a++;
            if (a %2 != 0){
                continue;
            }
            System.out.print(a + " ");
        }
    }
}
