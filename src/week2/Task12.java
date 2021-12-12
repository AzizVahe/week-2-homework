package week2;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        String day1 = "Monday";
        String day2 = "Tuesday";
        String day3 = "Wednesday";
        String day4 = "Thursday";
        String day5 = "Friday";
        String day6 = "Saturday";
        String day7 = "Sunday";

        Scanner scanner = new Scanner(System.in);
        int dayNumber = scanner.nextInt();
        if (dayNumber >= 0 && dayNumber <= 7) {
            switch (dayNumber) {
                case 1:
                    System.out.println("Today is " + day1);
                    break;
                case 2:
                    System.out.println("Today is " + day2);
                    break;
                case 3:
                    System.out.println("Today is " + day3);
                    break;
                case 4:
                    System.out.println("Today is " + day4);
                    break;
                case 5:
                    System.out.println("Today is " + day5);
                    break;
                case 6:
                    System.out.println("Today is " + day6);
                    break;
                case 7:
                    System.out.println("Today is " + day7);
                    break;
            }
        } else {
            System.out.println("Please enter the value in the range 1 - 7");
        }
    }
}

