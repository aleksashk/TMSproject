package com.gmail.aleksandrphilimonov.lesson6.classWork.task1;

import java.util.stream.Stream;

public class MainApp {
    public static void main(String[] args) {
        CreditCard card1 = new CreditCard("08874000212FGR05415577554GH000-1", 100.00);
        CreditCard card2 = new CreditCard("12874000212FGR05415577554GH000-1", 200.00);
        CreditCard card3 = new CreditCard("23874000212FGR05415577554GH000-1", 300.00);

        Stream<CreditCard> stream = Stream.of(card1, card2, card3);
        stream.forEach(System.out::println);

        card1.addAmount(250.12);
        card2.addAmount(122245.45);
        card3.withdrawAmount(15.02);

        Stream<CreditCard> stream1 = Stream.of(card1, card2, card3);
        stream1.forEach(System.out::println);
    }
}
