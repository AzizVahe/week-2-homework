package week2;

import java.util.Random;
import java.util.Scanner;
import java.util.SplittableRandom;

public class Sevagir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Random random = new Random();
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
            if (arr[i] > 0) {
                positive++;
            }
            if (arr[i] < 0) {
                negative++;
            }
            if (i == arr.length - 1) {
                break;
            }
            System.out.println("The Numer of Negative Zeros is " + zero);
            System.out.println("The Numer of Positive Numbers is " + positive);
            System.out.println("The Numer of Negative Numbers is " + negative);
        }

    }
}



