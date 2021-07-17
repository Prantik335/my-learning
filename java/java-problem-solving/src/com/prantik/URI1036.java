package com.prantik;
// URI Online Judge | 1036 | Bhaskara's Formula | Java 8 | +3.9

import java.util.Scanner;

public class URI1036 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double v = b * b - 4 * a * c;

        if (a != 0 && v > 1) {
            double r1 = (-b + Math.sqrt(v)) / (2 * a);
            double r2 = (-b - Math.sqrt(v)) / (2 * a);

            System.out.printf("R1 = %.5f\nR2 = %.5f\n", r1, r2);
        } else {
            System.out.println("Impossivel calcular");
        }

    }
}
