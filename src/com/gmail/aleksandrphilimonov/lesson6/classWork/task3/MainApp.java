package com.gmail.aleksandrphilimonov.lesson6.classWork.task3;

public class MainApp {
    public static void main(String[] args) {
        Atm atm = new Atm(100,100,100);
        System.out.println(atm);
        atm.addMoney(2550);
        System.out.println(atm);
        atm.withdrawMoney(1220);
        System.out.println(atm);
    }
}
