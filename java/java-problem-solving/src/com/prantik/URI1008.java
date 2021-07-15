package com.prantik;
// URI Online Judge | 1008 | Salary | Java 8

import java.util.Scanner;

public class URI1008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int employees = scanner.nextInt();
        int worked_hours = scanner.nextInt();
        double hourly_salary = scanner.nextDouble();

        System.out.println("NUMBER = " + employees);
        System.out.printf("SALARY = U$ %.2f\n", worked_hours * hourly_salary);
    }
}
