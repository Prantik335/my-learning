package com.prantik;
// URI Online Judge | 1018 | Banknotes | Java 8 | +4.0

import java.util.Scanner;

public class URI1018 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int money = scanner.nextInt();
        System.out.println(money);

        int note100 = money / 100;
        money %= 100;
        int note50 = money / 50;
        money %= 50;
        int note20 = money / 20;
        money %= 20;
        int note10 = money / 10;
        money %= 10;
        int note5 = money / 5;
        money %= 5;
        int note2 = money / 2;
        money %= 2;
        int note1 = money;

        System.out.printf("%d nota(s) de R$ 100,00\n", note100);
        System.out.printf("%d nota(s) de R$ 50,00\n", note50);
        System.out.printf("%d nota(s) de R$ 20,00\n", note20);
        System.out.printf("%d nota(s) de R$ 10,00\n", note10);
        System.out.printf("%d nota(s) de R$ 5,00\n", note5);
        System.out.printf("%d nota(s) de R$ 2,00\n", note2);
        System.out.printf("%d nota(s) de R$ 1,00\n", note1);

    }

}
