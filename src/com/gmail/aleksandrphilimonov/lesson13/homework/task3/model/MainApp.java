package com.gmail.aleksandrphilimonov.lesson13.homework.task3.model;

import java.util.Scanner;
import java.util.Stack;

public class MainApp {

    static boolean checkBrackets(String expression) {
        Stack<Character> stack = new Stack<>();
        for (char ch : expression.toCharArray()) {
            if (ch == '[' || ch == '(' || ch == '{') {
                stack.push(ch);
                continue;
            }
            if (stack.empty()) {
                return false;
            }
            if (ch == ']' && stack.peek() != '[') {
                return false;
            }
            if (ch == ')' && stack.peek() != '(') {
                return false;
            }
            if (ch == '}' && stack.peek() != '{') {
                return false;
            }
            stack.pop();
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        String msg = "input string like '{([])}'";
        System.out.println(msg);
        Scanner scanner = new Scanner(System.in);
        String brackets = scanner.next();
        System.out.println("is brackets in the string correct? - " + checkBrackets(brackets));
    }
}
