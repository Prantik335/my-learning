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

    char[] symbols = {'*', 'P', 'N'};

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
            int command = input("");
            updateTTT(command);
            changePlayer();
        }
    }

    private void updateTTT(int command) {
        int _command = command - 1;
        ttt[_command / 3][_command % 3] = player + 1;
    }

    private void changePlayer() {
        if (player == Player.A) {
            player = Player.B;
        } else {
            player = Player.A;
        }
    }

    private int input(String error_msg) {
        Scanner scanner = new Scanner(System.in);
        int input;
        if (error_msg.isEmpty()) {
            System.out.printf("Hey %s, your turn: ", players[player]);
        } else {
            System.out.printf("Hey %s, %s", players[player], error_msg);
        }
        try {
            input = scanner.nextInt();
            int _input = input - 1;

            if (ttt[_input / 3][_input % 3] != 0) {
                return input("This " + input + " is already covered. Turn again: ");
            } else if (input > 0 && input < 10) {
                return input;
            } else {
                return input("Invalid turn! Turn (1 - 9): ");
            }
        } catch (Exception e) {
            return input("Error! Turn again: ");
        }
    }

    private void printTTT() {
        System.out.println();
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                System.out.printf(" %c ", symbols[ttt[r][c]]);
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
