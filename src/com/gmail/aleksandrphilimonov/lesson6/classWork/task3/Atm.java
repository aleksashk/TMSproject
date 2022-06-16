package com.gmail.aleksandrphilimonov.lesson6.classWork.task3;

public class Atm {
    private int countOfMoney20;
    private int countOfMoney50;
    private int countOfMoney100;

    public Atm() {
        this.countOfMoney20 = 100;
        this.countOfMoney50 = 100;
        this.countOfMoney100 = 100;
    }

    public Atm(int money20, int money50, int money100) {
        this.countOfMoney20 = money20;
        this.countOfMoney50 = money50;
        this.countOfMoney100 = money100;
    }

    public int getCountOfMoney20() {
        return countOfMoney20;
    }

    public void setCountOfMoney20(int countOfMoney20) {
        this.countOfMoney20 = countOfMoney20;
    }

    public int getCountOfMoney50() {
        return countOfMoney50;
    }

    public void setCountOfMoney50(int countOfMoney50) {
        this.countOfMoney50 = countOfMoney50;
    }

    public int getCountOfMoney100() {
        return countOfMoney100;
    }

    public void setCountOfMoney100(int countOfMoney100) {
        this.countOfMoney100 = countOfMoney100;
    }

    public void addMoney(int amount) {
        if (amount >= 100) {
            countOfMoney100 += (amount - amount % 100) / 100;
        }
        amount = amount % 100;
        if (amount >= 50) {
            countOfMoney50 += (amount - amount % 50) / 50;
        }
        amount = amount % 50;
        if (amount >= 20) {
            countOfMoney20 += (amount - amount % 20) / 20;
        }
    }

    public boolean withdrawMoney(int amount) {
        if (countOfMoney20 * 20 + countOfMoney50 * 50 + countOfMoney100 * 100 >= amount) {
            if (amount >= 100) {
                countOfMoney100 -= (amount - amount % 100) / 100;
                System.out.println("count of 100 = " + (amount - amount % 100) / 100);
            }
            amount = amount % 100;
            if (amount >= 50) {
                countOfMoney50 -= (amount - amount % 50) / 50;
                System.out.println("count of 50 = " + (amount - amount % 50) / 50);
            }
            amount = amount % 50;
            if (amount >= 20) {
                countOfMoney20 -= (amount - amount % 20) / 20;
                System.out.println("count of 20 = " + (amount - amount % 20) / 20);
            }
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {" +
                "countOfMoney20=" + countOfMoney20 +
                ", countOfMoney50=" + countOfMoney50 +
                ", countOfMoney100=" + countOfMoney100 +
                " total: " + (countOfMoney20 * 20 + countOfMoney50 * 50 + countOfMoney100 * 100);
    }
}
