package com.prantik;

public class Main {
    public static void main(String[] args) {
        Pig pig = new Pig();
        pig.animalSound();
        pig.sleep();

        DemoClass obj = new DemoClass();
        obj.myMethod();
        obj.myOtherMethod();
    }
}

interface Animal {
    public void animalSound();

    public void sleep();
}

class Pig implements Animal {

    @Override
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }

    @Override
    public void sleep() {
        System.out.println("Zzz");
    }
}

interface If1 {
    public void myMethod();
}

interface If2 {
    public void myOtherMethod();
}

class DemoClass implements If1, If2 {

    @Override
    public void myMethod() {
        System.out.println("Some text..");
    }

    @Override
    public void myOtherMethod() {
        System.out.println("Some other text...");
    }
}