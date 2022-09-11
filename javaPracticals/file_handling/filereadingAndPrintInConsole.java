package com.javatraineronline.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class SimpleFileReading {

    public static void main(String[] args) {

        String path = "D://data.txt"; // We can change path accordingly

        // Defining the File object with path of the file
        File file = new File(path);

        try {

            // Defining the Reader Object with File argument
            FileReader fileReader = new FileReader(file);

            int data = fileReader.read(); // Reading each character

            while(data != -1) { // Traverse up to no character to read( -1 if no character)

                // Printing the each character
                System.out.print((char)data); // Converting (ASCII Value) int to char
                data = fileReader.read();
            }

            fileReader.close();

        } catch (FileNotFoundException e) {

            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {

            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }

}