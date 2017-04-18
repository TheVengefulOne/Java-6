package main.java.com.Alexandr.practice.modul07.zadacha1;

/**
 * Created by admin on 09.03.2017.
 */
public class Rectangle extends Shape {

   private final double a;
   private final double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea(double area) {
        return a * b;
    }
}
