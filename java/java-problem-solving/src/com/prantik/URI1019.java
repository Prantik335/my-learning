package com.prantik;
// URI Online Judge | 1019 | Time Conversion | Java 8 | +1.5

import java.util.Scanner;

public class URI1019 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int time = scanner.nextInt();
        int hour = time / 3600;
        int min = (time % 3600) / 60;
        int sec = (time % 3600) % 60;

        System.out.printf("%d:%d:%d\n", hour, min, sec);
    }

}
