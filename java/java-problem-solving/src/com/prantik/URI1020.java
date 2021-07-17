package com.prantik;
// URI Online Judge | 1020 | Fuel Spent | Java 8 | +2.0

import java.util.Scanner;

public class URI1020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();
        int years = age / 365;
        int months = (age % 365) / 30;
        int days = (age % 365) % 30;

        System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n", years, months, days);
    }
}
