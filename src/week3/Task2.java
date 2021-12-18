package week3;

import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size");
        Random random = new Random();
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = random.nextInt(100);
            if(arr[i]%2 ==0){
                System.out.println(arr[i]);
            }
        }
    }
}
