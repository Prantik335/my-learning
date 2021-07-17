package com.prantik;
// URI Online Judge | 1040 | Average 3 | Java 8 | +5.8

import java.util.Scanner;
import java.text.DecimalFormat;

public class URI1040 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n1 = scanner.nextDouble();
        double n2 = scanner.nextDouble();
        double n3 = scanner.nextDouble();
        double n4 = scanner.nextDouble();

        double average = (n1 * 2 + n2 * 3 + n3 * 4 + n4) / 10.0;
        // it's not working
        // System.out.printf("Media: %.1f\n", average);

        // Working
        System.out.println("Media: " + new DecimalFormat("#0.0").format(average));

        if (average >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else if (average < 5.0) {
            System.out.println("Aluno reprovado.");
        } else {
            System.out.println("Aluno em exame.");

            double score = scanner.nextDouble();

            System.out.printf("Nota do exame: %.1f\n", score);

            double final_average = (average + score) / 2.0;

            if (final_average >= 5.0) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }

            System.out.printf("Media final: %.1f\n", final_average);
        }
    }
}
