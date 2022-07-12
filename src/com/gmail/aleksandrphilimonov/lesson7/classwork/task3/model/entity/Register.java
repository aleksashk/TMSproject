package com.gmail.aleksandrphilimonov.lesson7.classwork.task3.model.entity;

public class Register {
    private Contract[] storage;

    public Register() {
        storage = new Contract[10];
    }

    public void saveDoc(Contract doc) {
        int idx = getEmptyIndex();
        checkIdx(idx);
        this.storage[idx] = doc;
    }

    private static void checkIdx(int idx) {
        if (idx == -1) {
            throw new IllegalArgumentException("Register is full.");
        }
    }

    private int getEmptyIndex() {
        int idx = -1;
        for (int i = 0; i < storage.length; i++) {
            if (storage[i] == null) {
                idx = i;
                break;
            }
        }
        return idx;
    }

    public Contract[] getStorage() {
        return storage;
    }

    public void setStorage(Contract[] storage) {
        this.storage = storage;
    }
}
