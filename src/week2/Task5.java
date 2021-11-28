package week2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte age = scanner.nextByte();
        if(age >= 18){
            System.out.println("You are eligible to vote!");
        }else{
            System.out.println("You are not eligible to vote!");
        }
    }
}
