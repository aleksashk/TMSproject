package com.gmail.aleksandrphilimonov.lesson7.classwork.task1;

import com.gmail.aleksandrphilimonov.lesson7.classwork.task1.shape.Circle;
import com.gmail.aleksandrphilimonov.lesson7.classwork.task1.shape.Rectangle;
import com.gmail.aleksandrphilimonov.lesson7.classwork.task1.shape.Shape;
import com.gmail.aleksandrphilimonov.lesson7.classwork.task1.shape.Triangle;
import com.gmail.aleksandrphilimonov.util.UtilityClass;

public class MainApp {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(2.45),
                new Rectangle(1.01,2.21),
                new Triangle(12.02,5.12,8.32),
                new Circle(3.21),
                new Triangle(2.01,1.25,3.05)
        };

        for (Shape shape : shapes) {
            UtilityClass.printer("perimeter of " + shape.getClass().getSimpleName() + " is " + shape.getPerimeter() + "\n");
        }
    }
}
