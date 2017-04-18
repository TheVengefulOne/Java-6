package main.java.com.Alexandr.practice.modul07.zadacha1;

/**
 * Created by admin on 09.03.2017.
 */
public class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea(double area) {
        return side * side;
    }
}
