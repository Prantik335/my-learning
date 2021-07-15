package com.prantik;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x, y, sum;

        System.out.print("Enter a number: ");
        x = scanner.nextInt();
        System.out.print("Enter another number: ");
        y = scanner.nextInt();

        sum = x + y;

        System.out.println("Sum is: " + sum);
    }
}