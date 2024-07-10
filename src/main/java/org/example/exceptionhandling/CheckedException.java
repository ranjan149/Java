package org.example.exceptionhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedException {

    private String filePath;

    public void readFile(String filePath) {
        File file = new File(filePath);
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file);
            System.out.println("Lets read file: " + filePath);
        } catch (FileNotFoundException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                System.out.println("Error closing file: " + e.getMessage());
            }
        }
    }

    public void readAnotherFile(String filePath) {
        try(FileInputStream fileInputStream = new FileInputStream(new File(filePath))) {
            System.out.println("Lets read file: " + filePath);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

}
