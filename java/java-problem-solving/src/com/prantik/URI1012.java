package com.prantik;
// URI Online Judge | 1012 | Area | Java 8 | +2.1

import java.util.Scanner;

public class URI1012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        System.out.printf("TRIANGULO: %.3f\n",  a * c / 2);
        System.out.printf("CIRCULO: %.3f\n", 3.14159 * (c * c));
        System.out.printf("TRAPEZIO: %.3f\n", (a + b) / 2 * c);
        System.out.printf("QUADRADO: %.3f\n", b * b);
        System.out.printf("RETANGULO: %.3f\n", a * b);
    }
}
