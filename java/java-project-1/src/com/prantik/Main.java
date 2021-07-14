package com.prantik;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        LocalDate obj = LocalDate.now();
        System.out.println(obj);

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        System.out.println("Before formatting: " + dateTime);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("E dd-MMM-yyyy HH:mm:ss");
        System.out.println("After formatting: " + formatter.format(dateTime));
    }
}

