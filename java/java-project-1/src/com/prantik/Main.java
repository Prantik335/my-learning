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

class Vehicle {
    protected String brand = "Ford";
    public void honk() {
        System.out.println("Tuut, tuut!");
    }
}

class Car extends Vehicle {
    private String modelName = "Mustang";
    public static void main(String[] args) {
        Car car = new Car();

        car.honk();

        System.out.println(car.brand + " " + car.modelName);
    }
}