package com.prantik;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your Salary: ");
        double salary = scanner.nextDouble();

        System.out.println("\nDetails:\nUsername: " + username + "\nAge: " + age + "\nSalary: " + salary);
    }
}

