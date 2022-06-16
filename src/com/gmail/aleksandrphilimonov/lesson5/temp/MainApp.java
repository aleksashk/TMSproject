package com.gmail.aleksandrphilimonov.lesson5.temp;

import java.util.ArrayList;
import java.util.Collections;

public class MainApp {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        Collections.addAll(cities, "Minsk", "Vitebsk", "London", "Warshaw", "Omsk", "Dushanbe", "Prague");
        System.out.println(cities.stream().filter(w -> w.length() > 6).count());

    }
}


