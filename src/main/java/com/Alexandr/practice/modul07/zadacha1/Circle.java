package main.java.com.Alexandr.practice.modul07.zadacha1;

/**
 * Created by admin on 09.03.2017.
 */
public class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea(double area) {
        return radius * radius * Math.PI;

    }
}
