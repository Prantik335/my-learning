package com.prantik;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        HashSet<String> friends = new HashSet<String>();

        friends.add("Nahin");
        friends.add("Sciene");
        friends.add("Asif");
        friends.add("Nahid");

        System.out.println(friends.contains("Prantik"));
    }
}