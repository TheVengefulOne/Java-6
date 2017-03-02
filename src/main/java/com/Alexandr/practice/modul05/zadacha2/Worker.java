package main.java.com.Alexandr.practice.modul05.zadacha2;

import main.java.com.Alexandr.practice.modul04.Pen;

/**
 * Created by admin on 23.02.2017.
 */
public class Worker extends Person {
   private String adress;

    public double getSalary() {
        return salary;
    }

    private double salary;

    public Worker(double salary) {
        this.salary = salary;
    }
}
