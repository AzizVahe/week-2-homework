package week3;

import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size");
        Random random = new Random();
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            arr[i] = random.nextInt();
            if(arr[i] > 0){
                count++;
            }
        }for (int x : arr){
            System.out.println(x);
        }
        System.out.println();
        System.out.println(count);
    }
}
