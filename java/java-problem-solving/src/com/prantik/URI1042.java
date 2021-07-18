package com.prantik;
// URI Online Judge | 1042 | Simple Sort | Java 8 | +2.5

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class URI1042 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> inputs = new ArrayList<>();
        ArrayList<Integer> inputsCopy = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            int num = scanner.nextInt();
            inputs.add(num);
            inputsCopy.add(num);
        }

        Collections.sort(inputs);
        inputs.forEach(System.out::println);
        System.out.println();
        inputsCopy.forEach(System.out::println);
    }
}
