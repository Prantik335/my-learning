package com.prantik;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String sentence = scanner.nextLine();
            if (sentence.equals("")) {
                break;
            }

            String dancing_sentence = "";
            boolean doUpperCase = true;

            for (char letter : sentence.toCharArray()) {
                if (letter == ' ') {
                    dancing_sentence += ' ';
                    continue;
                }


                if ((letter >= 65 && letter <= 90) && !doUpperCase) {
                    letter += 32;
                } else if ((letter >= 97 && letter <= 122) && doUpperCase) {
                    letter -= 32;
                }

                dancing_sentence += letter;

                doUpperCase = !doUpperCase;
            }

            System.out.println(dancing_sentence);
        }
    }
}
