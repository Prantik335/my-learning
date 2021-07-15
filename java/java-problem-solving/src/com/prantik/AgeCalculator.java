package com.prantik;

import java.util.Scanner;
import java.time.LocalDate;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your birthday (yyyy-mm-dd): ");
        String inputString = scanner.nextLine();

        LocalDate date = LocalDate.now();
        LocalDate birthDate = LocalDate.parse(inputString);

//        int dateInDay = date.getDayOfYear() * 365 + date.getDayOfMonth() * 30 + date.

        System.out.println("You are " + date.compareTo(birthDate) +  " year(s) old");
    }
}
