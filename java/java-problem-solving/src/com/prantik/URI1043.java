package com.prantik;
// URI Online Judge | 1043 | Triangle | Java 8 | +2.7

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class URI1043 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> inputs = new ArrayList<>();
        double sum = 0;

        for (int i = 0; i < 3; i++) {
            double num = scanner.nextDouble();
            inputs.add(num);
            sum += num;
        }
        double area = (inputs.get(0) + inputs.get(1)) / 2 * inputs.get(2);
        inputs.sort(Comparator.naturalOrder());

        if (inputs.get(0) + inputs.get(1) > inputs.get(2)) {
            System.out.printf("Perimetro = %.1f\n", sum);
        } else {
            System.out.printf("Area = %.1f\n", area);
        }
    }
}
