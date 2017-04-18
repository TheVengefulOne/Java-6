package main.java.com.Alexandr.practice.modul06.Vebinar6.StaticExample1;

import main.java.com.Alexandr.practice.modul06.Vebinar6.StaticExample1.StaticExample;

/**
 * Created by admin on 17.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        StaticExample.setValue(1);

        StaticExample.intValue = 5;
        System.out.println(new StaticExample());
        System.out.println(new StaticExample());
        System.out.println(new StaticExample());

        StaticExample.intValue = 10;
        System.out.println(new StaticExample());
        System.out.println(new StaticExample());

    }
}
