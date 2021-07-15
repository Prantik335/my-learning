package com.prantik;
// URI Online Judge | 1006 | Average 2 | Java 8

import java.util.Scanner;

public class URI1006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double average = ((a * 2) + (b * 3) + (c * 5)) / 10;

        System.out.printf("MEDIA = %.1f\n", average);
    }
}
