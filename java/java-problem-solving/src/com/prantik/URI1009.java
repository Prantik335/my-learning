package com.prantik;
// URI Online Judge | 1009 | Salary with Bonus | Java 8

import java.util.Scanner;

public class URI1009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String employee = scanner.nextLine();
        double salary = scanner.nextDouble();
        double sales = scanner.nextDouble();

        System.out.printf("TOTAL = R$ %.2f\n", salary + (15 * sales / 100));
    }
}
