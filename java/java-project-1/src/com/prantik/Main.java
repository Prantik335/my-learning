package com.prantik;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.innerMethod();
    }
}

class OuterClass {
    int x = 10;

    class InnerClass {
        void innerMethod() {
            System.out.println(x);
        }
    }
}