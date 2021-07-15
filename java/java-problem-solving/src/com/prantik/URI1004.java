package com.prantik;

// URI Online Judge | 1004 | Simple Product | Java 8

import java.util.Scanner;

public class URI1004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int PROD = x * y;

        System.out.println("PROD = " + PROD);
    }
}
