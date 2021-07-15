package com.prantik;


public class Main {

    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[10]);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("The 'try catch' is finished");
        }

        checkAge(16);
    }

    public static void checkAge(int age) {
        if(age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }
}