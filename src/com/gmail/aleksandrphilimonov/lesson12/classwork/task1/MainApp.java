package com.gmail.aleksandrphilimonov.lesson12.classwork.task1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MainApp {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\tms\\temp\\com\\gmail\\aleksandrphilimonov\\file", "textFile.txt");
        File fileToWrite = new File("C:\\tms\\temp\\com\\gmail\\aleksandrphilimonov\\file", "newTextFile.txt");
        try (BufferedReader reader = new BufferedReader(new FileReader(file));
             BufferedWriter writer = new BufferedWriter(new FileWriter(fileToWrite))) {
            String line1 = reader.readLine();
            System.out.println(line1);
            writer.write(line1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
