package com.gmail.aleksandrphilimonov.lesson12.homework;

import com.gmail.aleksandrphilimonov.lesson12.homework.model.ParserDocumentNumber;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.stream.Collectors;

public class MainApp {
    public static void main(String[] args) throws FileNotFoundException {

        ParserDocumentNumber.sourceFileNameReport = new File("src/com/gmail/aleksandrphilimonov/lesson12/homework/resources/fileName.txt");
        ParserDocumentNumber.validFileNameReport = new File("src/com/gmail/aleksandrphilimonov/lesson12/homework/resources/correctFileName.txt");
        ParserDocumentNumber.invalidFileNameReport = new File("src/com/gmail/aleksandrphilimonov/lesson12/homework/resources/wrongFileName.txt");

        BufferedReader reader = ParserDocumentNumber.getFile();

        ParserDocumentNumber.fileName = reader.lines().collect(Collectors.toList());

        ParserDocumentNumber.getFileReport();
    }
}
