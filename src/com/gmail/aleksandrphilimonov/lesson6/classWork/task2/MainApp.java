package com.gmail.aleksandrphilimonov.lesson6.classWork.task2;

import com.gmail.aleksandrphilimonov.lesson6.classWork.task2.model.Computer;
import com.gmail.aleksandrphilimonov.lesson6.classWork.task2.model.Hdd;
import com.gmail.aleksandrphilimonov.lesson6.classWork.task2.model.Ram;

import java.util.stream.Stream;

public class MainApp {
    public static void main(String[] args) {
        Hdd hdd1T = new Hdd("SGateBaracuda", "1TB", "inner");
        Hdd hdd500GB = new Hdd("SGateBaracuda", "500GB", "inner");
        Hdd hdd256GB = new Hdd("Kingston", "256GB", "outer");
        Hdd hdd2GB = new Hdd("Kingston", "1TB", "outer");
        Hdd hdd4GB = new Hdd("Kingston", "1TB", "outer");

        Ram ram2G = new Ram("Kingston", "2GB");
        Ram ram8G = new Ram("Crucial", "8GB");
        Ram ram16G = new Ram("Crucial", "16GB");

        Computer computer1 = new Computer(250.00, "HP");
        Computer computer2 = new Computer(12250.00, "Acer", ram16G, hdd500GB);

        Stream<Computer> stream = Stream.of(computer1, computer2);
        stream.forEach(System.out::println);
    }
}
