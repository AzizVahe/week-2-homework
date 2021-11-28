package week2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double rad = scanner.nextDouble();
        double per = (2 * 3.14159) * rad;
        double area = 3.14159 * (rad * rad);
        System.out.println(per);
        System.out.println(area);
    }
}
