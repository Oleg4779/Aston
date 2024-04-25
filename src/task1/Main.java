package task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите число \"a\":");
        int a = scn.nextInt();
        System.out.println("Введите число \"b\":\"");
        int b = scn.nextInt();
        if (a < b) {
            System.out.println("a < b");
        } else if (a > b) {
            System.out.println("a > b");
        } else {
            System.out.println("a = b");
        }

        System.out.println(numbersAddition(a, b));
        System.out.println(numbersSubtraction(a, b));
        System.out.println(numbersMultiply(a, b));
        System.out.println(numbersDivision(a, b));
        scn.close();
    }

    public static int numbersAddition(int a, int b) {
        return a + b;
    }

    public static int numbersSubtraction(int a, int b) {
        return a - b;
    }

    public static int numbersMultiply(int a, int b) {
        return a * b;
    }

    public static double numbersDivision(int a, int b) {
        return (double) a / (double) b;
    }
}