package com.prantik;
// URI Online Judge | 1005 | Average 1 | Java 8

import java.util.Scanner;

public class URI1005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        double average = (a * 3.5 + b * 7.5) / 11;

        System.out.printf("MEDIA = %.5f\n", average);
    }
}
