package com.gmail.aleksandrphilimonov.lesson6.classWork.task3;

import com.gmail.aleksandrphilimonov.lesson6.classWork.task3.model.Atm;

public class MainApp {
    public static void main(String[] args) {
        Atm atm = new Atm(100,100,100);
        atm.showTheNumberOfBills();
        atm.addMoney(2550);
        atm.showTheNumberOfBills();
        atm.withdrawSomeMoney(1220);
        atm.showTheNumberOfBills();
    }
}
