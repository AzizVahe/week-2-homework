package week2;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
//        if (a > b && b!= 10){
//            System.out.println("Both a and b are legal");
//        }
//        else if (a < b && b!=10){
//                System.out.println("a is illegal b is legal");
//            }
//        else if ((a > b) && (b == 10)){
//                System.out.println("a is legal b is illegal");
//        }

//        if(a > 0 && b > 0){
//            System.out.println("Both a and b are legal");
//        }
//        else if(a < 0 && b > 0){
//            System.out.println("a is illegal b is legal");
//        }
//        else if(a > 0 && b < 0){
//            System.out.println("a is legal b is illegal");
//        }

//        if(a < 0 && b < 0){
//            System.out.println("Both a and b are legal");
//        }
//        else if(a > 0 && b < 0){
//            System.out.println("a is illegal b is legal");
//        }
//        else if(a < 0 && b > 0){
//            System.out.println("a is legal b is illegal");
//        }
        if (a % 5 == 0 && b % 5 == 0) {
            System.out.println("Boat a and b are leagal");
        }
        if ((a %5 != 0 && b %5 == 0) || (a %5 == 0 && b %5 != 0)){

        }
    }
}


