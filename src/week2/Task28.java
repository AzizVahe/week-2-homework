package week2;

import java.util.Scanner;

public class Task28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int zero = 0;
        int positive = 0;
        int negative = 0;
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println(" Please enter " + (n - 1) + " too");
        arr[0] = n;
        for (int i = 1; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
            if (arr[i] == 0) {
                zero++;
            }
            else if (arr[i] > 0) {
                positive++;
            }
            else if (arr[i] < 0) {
                negative++;
            }
            if (i == arr.length - 1) {
                break;
            }

        }
        System.out.println("The Count of Negative Zeros is " + zero);
        System.out.println("The Count of Positive Numbers is " + positive);
        System.out.println("The Count of Negative Numbers is " + negative);


    }
}
