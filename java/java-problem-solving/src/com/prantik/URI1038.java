package com.prantik;
// URI Online Judge | 1038 | Snack | Java 8 | +1.8

import java.util.Scanner;

public class URI1038 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] products = {4.0, 4.5, 5.0, 2.0, 1.5};

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        System.out.printf("Total: R$ %.2f\n", products[x - 1] * y);
    }
}
