package com.prantik;
//URI Online Judge | 1007 | Difference | Java 8

import java.util.Scanner;

public class URI1007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int dif = a * b - c * d;

        System.out.println("DIFERENCA = " + dif);
    }
}
