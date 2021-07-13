package com.prantik;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal pig = new Pig();
        Animal dog = new Dog();

        animal.animalSound();
        pig.animalSound();
        dog.animalSound();
    }
}

class Animal {
    public void animalSound() {
        System.out.println("The animal make a sound");
    }
}

class Pig extends Animal {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}

class Dog extends Animal {
    public void animalSound() {
        System.out.println("This dog says: bow bow");
    }
}