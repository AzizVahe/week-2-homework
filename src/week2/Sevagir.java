package week2;

import com.sun.jdi.Value;

import java.util.Random;
import java.util.Scanner;
import java.util.Spliterator;

public class Sevagir {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++){
            arr[i] = i;
        }
        for (int x : arr){
            System.out.println(x);
        }
    }

}




