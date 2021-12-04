package week2;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = 0;
        while (a < n){
            a++;
            if(a %3 == 0){
                continue;
            }
            System.out.print(a + " ");
        }
    }
}
