package com.prantik;
// URI Online Judge | 1013 | The Greatest | Java 8 | +3.3

import java.util.Scanner;

public class URI1013 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int ab = (a + b + Math.abs(a - b)) / 2;
        ab = (ab + c + Math.abs(ab - c)) / 2;

        System.out.printf("%d eh o maior\n", ab);
    }
}
