package com.prantik;


interface StringFunction {
    String run(String str);
}

public class Main {

    public static void main(String[] args) {
        StringFunction tag = new StringFunction() {
            @Override
            public String run(String s) {
                return "#" + s;
            }
        };
        StringFunction tagLambda = s -> "#" + s;
        StringFunction exclaim = (s) -> s + "!";
        StringFunction ask = (s) -> s + "?";
        printFormatted("Hello", exclaim);
        printFormatted("Hello", ask);
        printFormatted("Hello", tag);
        printFormatted("Hello", tagLambda);
    }

    public static void printFormatted(String str, StringFunction format) {
        String result = format.run(str);
        System.out.println(result);
    }
}