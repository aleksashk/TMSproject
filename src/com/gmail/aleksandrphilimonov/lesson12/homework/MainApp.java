package com.gmail.aleksandrphilimonov.lesson12.homework;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MainApp {
    public static void main(String[] args) throws FileNotFoundException {

        BufferedReader reader = getFile();

        List<String> fileName = reader.lines().collect(Collectors.toList());

        List<String> correctDocumentNumber = getCorrectDocumentNumber(fileName);
        List<String> wrongDocumentNumber = getWrongDocumentNumber(fileName);

        showDocumentNumbers(correctDocumentNumber, wrongDocumentNumber);
    }

    private static void showDocumentNumbers(List<String> correctDocumentNumber, List<String> wrongDocumentNumber) {
        System.out.println("Correct numbers of documents: ");
        System.out.println(correctDocumentNumber);
        System.out.println("Wrong numbers of documents: ");
        System.out.println(wrongDocumentNumber);
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
