package com.prantik;

import java.io.FileWriter;
import java.io.IOException;


public class WriteToFile {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("H:\\Other\\test\\file1.txt");
            writer.write("Files in Java might be tricky, but it is fun enough!");
            writer.close();
            System.out.println("Successfully wrote to the file");
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
