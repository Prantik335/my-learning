package com.prantik;
// URI Online Judge | 1014 | Consumption | Java 8 | +1.6

import java.util.Scanner;

public class URI1014 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int distance = scanner.nextInt();
        double fuel = scanner.nextDouble();

        System.out.printf("%.3f km/l\n", distance / fuel);
    }
}
