package org.example.InputOutput;

import java.io.*;
import java.nio.Buffer;

public class FileCharacterStream {

    //FileReader
    public void readFile(String fileName) {
        File file = new File(fileName);
        try (FileReader reader = new FileReader(file)){
            int i;
            while ((i = reader.read()) != -1) {
                System.out.print((char) i);
            }

        } catch (IOException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }

    }

    //File Reader without File objetc
    public void readFileWithoutFileObject(String fileName) {
        try (FileReader reader = new FileReader(fileName)){
            int i;
            while ((i = reader.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }


    //File Writer
    public void writeFile(String fileName) {
        File file = new File(fileName);
        try(FileWriter fileWriter = new FileWriter(file)){
            fileWriter.write("Tis is a new file for write.");
        } catch (IOException e){
            System.out.println("Error occurred while writing to file: " + e.getMessage());
        }
    }

    public void readFileWithBuffer(String filePath)  {
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            int i;
            while ((i = reader.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e){
            System.out.println("Error Occurred");
        }
    }

    public static void main(String[] args) {
        FileCharacterStream fileCharacterStream = new FileCharacterStream();
//        fileCharacterStream.readFileWithoutFileObject("src/main/resources/test.txt");
//        fileCharacterStream.writeFile("src/main/resources/test-write.txt");

        fileCharacterStream.readFileWithBuffer("src/main/resources/test.txt");
    }

}
