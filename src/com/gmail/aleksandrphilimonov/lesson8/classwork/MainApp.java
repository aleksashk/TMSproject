package com.gmail.aleksandrphilimonov.lesson8.classwork;

import com.gmail.aleksandrphilimonov.lesson8.classwork.task1.model.Phone;
import com.gmail.aleksandrphilimonov.util.UtilityClass;

import java.util.stream.Stream;

public class MainApp {
    public static void main(String[] args) {
        Phone phone1 = new Phone("QX-1123", "+375297878784", 350);
        Phone phone2 = new Phone("Rovar", "+375331004578", 450);
        Phone phone3 = new Phone("Motorola", "+375254578120", 3100);

        Stream.of(phone1, phone2, phone3).forEach(System.out::println);

        phone1.receiveCall("ValentiNO");
        UtilityClass.printer(phone1.getNumber() + "\n");
        phone2.receiveCall("Levij");
        UtilityClass.printer(phone2.getNumber() + "\n");
        phone3.receiveCall("Platon");
        UtilityClass.printer(phone3.getNumber() + "\n");

        phone1.receiveCall("ValentiNO", "125");
        phone2.receiveCall("Levij", "04157");
        phone3.receiveCall("Platon", "+UFO-45");

        String[] listPhones = {
                "+375291112233",
                "+375291112237",
                "+375291100436",
                "+375291117835",
                "+375291115634",
                "+375291189232",
                "+375291772231",
                "+375291562203"
        };

        phone1.sendMessage(listPhones);
        phone1.sendMessage("123365", "245784", "1245454");
        phone1.sendMessage("102");

    }
}
