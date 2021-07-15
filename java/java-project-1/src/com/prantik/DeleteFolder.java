package com.prantik;

import java.io.File;

public class DeleteFolder {
    public static void main(String[] args) {
        File folder = new File("H:\\Other\\test");
        if (folder.delete()) {
            System.out.println("Deleted the folder: " + folder.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}
