package main.java.com.Alexandr.practice.modul03.OOP;

/**
 * Created by Natus Vincere on 08.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        Vebinars vebinar1 = new Vebinars(1001, "Jack",50,"Google");
        Vebinars vebinar2 = new Vebinars(1002, "Dima",50,"Google");
        Vebinars vebinar3 = new Vebinars(22);

        System.out.println(vebinar1.getAge());
        System.out.println(vebinar1.getName());
        System.out.println(vebinar1.getId());
        System.out.println(vebinar1.getCompanyName());



    }
}
