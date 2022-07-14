package com.gmail.aleksandrphilimonov.lesson13.homework.task1.model;

import com.gmail.aleksandrphilimonov.util.UtilityClass;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class DocumentNameParser {
    public final static File fileNameReport = new File("src/com/gmail/aleksandrphilimonov/lesson13/homework/task1/resource/report.txt");
    public static HashMap<String, String> report = new HashMap<>();

    private HashSet<String> getSetOfFilePaths() {
        String exit = "0";
        HashSet<String> filePaths = new HashSet<>();
        String msg = "input a path and name of file or input 0 for EXIT: ";
        UtilityClass.print(msg);
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        while (!exit.equals(string)) {
            filePaths.add(string);
            UtilityClass.print(msg);
            string = scanner.nextLine();
        }
        return filePaths;
    }

    private void getSetOfFilePathsWithComments(HashSet<String> set) {
        for (String string : set) {
            String comment = getCause(string);
            report.put(string, comment);
        }
    }

    public void getReport() {
        HashSet<String> set = getSetOfFilePaths();
        getSetOfFilePathsWithComments(set);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileNameReport))) {
            for (Map.Entry<String, String> entry : report.entrySet()) {
                writer.write(entry.getKey() + " -> comment: " + entry.getValue());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String getCause(String str) {
        StringBuilder sb = new StringBuilder(str);
        if (!isDocumentNumberCorrect(str)) {
            sb.append(" -> wrong document number. It should not contain service characters, and the length of the file name should be equal to 19.");
            if ((str.startsWith("docnum") || str.startsWith("contract")) && str.length() != 19) {
                sb.append("\n\tDETAILS: Incorrect length of the document number. It should be equal to 19.");
            } else if (!str.startsWith("docnum") || !str.startsWith("contract")) {
                sb.append("\n\tDETAILS: Incorrect document name. It should start with [docnum] or [contract].");
            }
        } else {
            sb.append(" File name is correct!");
        }
        return sb.toString();
    }

    private static boolean isDocumentNumberCorrect(String docNumber) {
        return docNumber.matches("docnum\\w{9}\\.txt") ||
                docNumber.matches("contract\\w{7}\\.txt");
    }
}
