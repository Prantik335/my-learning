package com.prantik;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        int userId = random.nextInt(1000000);
        System.out.println("Username is: " + username + ", User Id: " + userId);
    }
}
