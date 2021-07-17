package com.prantik;
// URI Online Judge | 1021 | Banknotes and Coins | Java 8 | +6.3

import java.util.Scanner;

public class URI1021 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = scanner.nextDouble();
        int paperMoney = (int) money;
        int coinMoney = (int) Math.round((money - paperMoney) * 100);

        int note100 = paperMoney / 100;
        paperMoney %= 100;
        int note50 = paperMoney / 50;
        paperMoney %= 50;
        int note20 = paperMoney / 20;
        paperMoney %= 20;
        int note10 = paperMoney / 10;
        paperMoney %= 10;
        int note5 = paperMoney / 5;
        paperMoney %= 5;
        int note2 = paperMoney / 2;
        paperMoney %= 2;
        int coin100 = paperMoney;

        System.out.println("NOTAS:");
        System.out.printf("%d nota(s) de R$ 100.00\n", note100);
        System.out.printf("%d nota(s) de R$ 50.00\n", note50);
        System.out.printf("%d nota(s) de R$ 20.00\n", note20);
        System.out.printf("%d nota(s) de R$ 10.00\n", note10);
        System.out.printf("%d nota(s) de R$ 5.00\n", note5);
        System.out.printf("%d nota(s) de R$ 2.00\n", note2);

        int coin50 = coinMoney / 50;
        coinMoney %= 50;
        int coin25 = coinMoney / 25;
        coinMoney %= 25;
        int coin10 = coinMoney / 10;
        coinMoney %= 10;
        int coin05 = coinMoney / 5;
        coinMoney %= 5;
        int coin01 = coinMoney;

        System.out.println("MOEDAS:");
        System.out.printf("%d moeda(s) de R$ 1.00\n", coin100);
        System.out.printf("%d moeda(s) de R$ 0.50\n", coin50);
        System.out.printf("%d moeda(s) de R$ 0.25\n", coin25);
        System.out.printf("%d moeda(s) de R$ 0.10\n", coin10);
        System.out.printf("%d moeda(s) de R$ 0.05\n", coin05);
        System.out.printf("%d moeda(s) de R$ 0.01\n", coin01);
    }

}
