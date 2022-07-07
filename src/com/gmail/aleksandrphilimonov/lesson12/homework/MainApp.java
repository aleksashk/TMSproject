package com.gmail.aleksandrphilimonov.lesson12.homework;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MainApp {
    public static void main(String[] args) throws FileNotFoundException {

        BufferedReader reader = getFile();

        List<String> fileName = reader.lines().collect(Collectors.toList());

        List<String> correctDocumentNumber = getCorrectDocumentNumber(fileName);
        fileName.removeAll(correctDocumentNumber);

        try (BufferedWriter correctWriter = new BufferedWriter(new FileWriter("correctFileName.txt")); BufferedWriter wrongWriter = new BufferedWriter(new FileWriter("wrongFileName.txt"))) {
            for (String str : correctDocumentNumber) {
                correctWriter.write(str);
                correctWriter.newLine();
            }
            for (String str : fileName) {
                StringBuilder sb = new StringBuilder(str);
                sb.append(getCause(str));
                wrongWriter.write(sb.toString());
                wrongWriter.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static String getCause(String str) {
        StringBuilder sb = new StringBuilder();
        if ((str.startsWith("docnum") || str.startsWith("contract")) && str.length() != 15) {
            sb.append(" -> wrong length of the document number. It should be equals 15");
        } else if (!str.startsWith("docnum") || !str.startsWith("contract")) {
            sb.append(" -> wrong name of document. It should be starts with docnum or contract");
        }
        return sb.toString();
    }

    private static List<String> getWrongDocumentNumber(List<String> fileName) {
        return fileName.stream()
                .filter(e -> !isDocumentNumberCorrect(e))
                .collect(Collectors.toList());
    }

    private static List<String> getCorrectDocumentNumber(List<String> fileName) {
        return fileName.stream()
                .filter(e -> isDocumentNumberCorrect(e))
                .collect(Collectors.toList());
    }

    private static BufferedReader getFile() throws FileNotFoundException {
        System.out.println("Enter the name of file with documents numbers: ");
        Scanner scanner = new Scanner(System.in);
        String textFile = scanner.next();
        File file = new File(textFile);
//        File file = new File("fileName.txt");
        return new BufferedReader(new FileReader(file));
    }

    private static boolean isDocumentNumberCorrect(String docNumber) {
        return docNumber.matches("docnum\\w{9}\\.txt") ||
                docNumber.matches("contract\\w{7}\\.txt");
    }
}
