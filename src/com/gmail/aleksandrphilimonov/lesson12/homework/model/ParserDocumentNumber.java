package com.gmail.aleksandrphilimonov.lesson12.homework.model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ParserDocumentNumber {

    public static File sourceFileNameReport;
    public static File validFileNameReport;
    public static File invalidFileNameReport;

    public static List<String> fileName = new ArrayList<>();

    public static void getFileReport() {
        try (BufferedWriter correctWriter = new BufferedWriter(new FileWriter(validFileNameReport)); BufferedWriter wrongWriter = new BufferedWriter(new FileWriter(invalidFileNameReport))) {

            for (String str : fileName) {
                if (isDocumentNumberCorrect(str)) {
                    correctWriter.write(str);
                    correctWriter.newLine();
                } else {
                    String string = getCause(str);
                    wrongWriter.write(string);
                    wrongWriter.newLine();
                }
            }
        } catch (
                IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static String getCause(String str) {
        StringBuilder sb = new StringBuilder(str);
        if (!isDocumentNumberCorrect(str)) {
            sb.append(" -> wrong document number. It should not contain service characters, and the length of the file name should be equal to 19.");
        }
        if ((str.startsWith("docnum") || str.startsWith("contract")) && str.length() != 19) {
            sb.append("\n\tDETAILS: Incorrect length of the document number. It should be equal to 19.");
        }else if (!str.startsWith("docnum") || !str.startsWith("contract")) {
            sb.append("\n\tDETAILS: Incorrect document name. It should start with [docnum] or [contract].");
        }
        return sb.toString();
    }

    public static BufferedReader getFile() throws FileNotFoundException {
        return new BufferedReader(new FileReader(sourceFileNameReport));
    }

    private static boolean isDocumentNumberCorrect(String docNumber) {
        return docNumber.matches("docnum\\w{9}\\.txt") ||
                docNumber.matches("contract\\w{7}\\.txt");
    }
}
