package week2;

import java.util.Random;
import java.util.Scanner;

public class Sevagir {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            int num = random.nextInt();
            if (num < 0) {
                num = -num;
            }
            arr[i] = num % 10;
        }
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if (min > arr [i]){
                min = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println(min);

    }
}



