package week2;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int average = 0;
        int quiz = scanner.nextInt();
        int mid_term = scanner.nextInt();
        int finalScore = scanner.nextInt();
        average += quiz;
        average += mid_term;
        average += finalScore;
        average /= 3;
        if (average >= 80) {
            System.out.println("Grade A");
        } else if (average >= 60 && average < 80) {
            System.out.println("Grade B");
        } else if (average >= 40 && average < 60) {
            System.out.println("Grade C");
        } else {
            System.out.println("Grade F");
        }
    }
}
