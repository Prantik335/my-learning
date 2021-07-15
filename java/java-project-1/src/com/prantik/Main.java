package com.prantik;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<>();

        capitalCities.put("Bangladesh", "Dhaka");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        for(String key: capitalCities.keySet()) {
            System.out.println("key: " + key + " - value: " + capitalCities.get(key));
        }
        System.out.println();

        HashMap<String, Integer> students = new HashMap<>();

        students.put("Asif", 18);
        students.put("Prantik", 16);
        students.put("Nahin", 17);

        for(String key: students.keySet()) {
            System.out.println(key + " is " + students.get(key) + " years old.");
        }
    }
}