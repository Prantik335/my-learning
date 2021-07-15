package com.prantik;

import java.util.Scanner;

public class TicTacToe {
    int[][] ttt = {
            {0, 0, 0},
            {0, 0, 0},
            {0, 0, 0},
    };

    boolean gameRunning = false;

    private class Player {
        static final int A = 0;
        static final int B = 1;
    }

    int player = Player.A;
    String[] players = {"Prantik", "Nahin"};

    public static void main(String[] args) {
        TicTacToe ticTacToe = new TicTacToe();

        ticTacToe.run();
    }

    public void run() {
        gameRunning = true;
        while (gameRunning) {
            printTTT();
            printPlayMsg();
        }
    }

    private void changePlayer() {
        if (player == Player.A) {
            player = Player.B;
        } else {
            player = Player.A;
        }
    }

    private void printPlayMsg() {
        System.out.printf("Hey %s, your turn: ", players[player]);
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        // TODO - validation

        changePlayer();
    }

    private void printTTT() {
        System.out.println();
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                System.out.printf(" %d ", ttt[r][c]);
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
