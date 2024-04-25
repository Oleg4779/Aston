package task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите первую строку: ");
        String str1 = scn.nextLine();
        System.out.println("Введите вторую строку: ");
        String str2 = scn.nextLine();
        String result = str1.equals(str2) ? "Строки идентичны" : "Строки неидентичны";
        System.out.println(result);

        scn.close();
    }
}
