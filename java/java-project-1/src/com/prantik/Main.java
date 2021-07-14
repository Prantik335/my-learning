package com.prantik;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(30);
        Collections.sort(numbers);
        for(int num: numbers) {
            System.out.println(num);
        }
    }
}

