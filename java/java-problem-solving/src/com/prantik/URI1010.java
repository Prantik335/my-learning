package com.prantik;
// URI Online Judge | 1010 | Simple Calculate | Java 8

import java.util.Scanner;

public class URI1010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] product1 = scanner.nextLine().split(" ");
        String[] product2 = scanner.nextLine().split(" ");

        double product1_price = Integer.parseInt(product1[1]) * Double.parseDouble(product1[2]);
        double product2_price = Integer.parseInt(product2[1]) * Double.parseDouble(product2[2]);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", product1_price + product2_price);
    }
}
