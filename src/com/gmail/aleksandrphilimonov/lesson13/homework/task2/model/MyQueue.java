package com.gmail.aleksandrphilimonov.lesson13.homework.task2.model;

import java.util.Stack;

public class MyQueue<T> {
    Stack<T> storage;
    Stack<T> tmpStorage;

    public MyQueue() {
        this.storage = new Stack<>();
        this.tmpStorage = new Stack<>();
    }

    public void enqueue(T t) {
        storage.push(t);
    }

    public void dequeue() {
        if (!tmpStorage.isEmpty()) {
            tmpStorage.pop();
        } else {
            while (!storage.isEmpty()) {
                tmpStorage.push(storage.pop());
            }
            tmpStorage.pop();
        }
    }

    public void printDeQueue() {
        if (!storage.isEmpty()) {
            System.out.println(storage.peek());
        } else {
            System.out.println(tmpStorage.peek());
        }
    }
}
