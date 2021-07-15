package com.prantik;


public class Main implements Runnable {

    public static int amount = 0;

    public static void main(String[] args) {
        Thread thread = new Thread(new Main());
        thread.start();

        while(thread.isAlive()) {
            System.out.println("Waiting....");
        }

        System.out.println("Main: " + amount);
        amount++;
        System.out.println("Main: " + amount);
    }

    public void run() {
//        System.out.println("This code is running in a Thread");
        amount++;
    }
}