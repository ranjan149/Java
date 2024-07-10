package org.example.InputOutput;

import java.io.*;

public class FileByteStream {

    //FileReader
    public void readFile(String fileName) {
        File file = new File(fileName);
        try (FileInputStream reader = new FileInputStream(file)){
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
        try(FileOutputStream fileWriter = new FileOutputStream(file)){
            String str = "This is a new file for write.";
            byte[] strBytes = str.getBytes();
            fileWriter.write(strBytes);
        } catch (IOException e){
            System.out.println("Error occurred while writing to file: " + e.getMessage());
        }

    }

    public void readAndWriteImage(String imagePath){
        File file = new File(imagePath);
        String outputImagePath = "src/main/resources/image-copy.jpg";
        try(FileInputStream inputStream = new FileInputStream(file);
            FileOutputStream outputStream = new FileOutputStream(outputImagePath)){
            while(inputStream.available() > 0){
                outputStream.write(inputStream.read());
            }
        } catch (IOException e){
            System.out.println("Error Occurred");
        }


    }


    public static void main(String[] args) {
        FileByteStream fileByteStream = new FileByteStream();
//        fileByteStream.readFile("src/main/resources/test.txt");
//        fileByteStream.writeFile("src/main/resources/test-write-bytes.txt");
        fileByteStream.readAndWriteImage("src/main/resources/229-westerlund-21.jpg");
    }

}
