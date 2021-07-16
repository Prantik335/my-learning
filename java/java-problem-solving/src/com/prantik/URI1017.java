package com.prantik;
// URI Online Judge | 1017 | Fuel Spent | Java 8 | +1.9

import java.util.Scanner;

public class URI1017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int spent_time = scanner.nextInt();
        int average_speed = scanner.nextInt();

        System.out.printf("%.3f\n", spent_time * average_speed / 12.0);
    }

}
