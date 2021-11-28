package week2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double d = scanner.nextDouble();
        float f = (float) d;
        System.out.println(d);
        System.out.println(f);
        long l = (long)f;
        System.out.println(f);
        System.out.println(l);
        int i = (int)l;
        System.out.println(l);
        System.out.println(i);
        short s = (short)i;
        System.out.println(i);
        System.out.println(s);
        byte b = (byte)s;
        System.out.println(s);
        System.out.println(b);

    }
}
