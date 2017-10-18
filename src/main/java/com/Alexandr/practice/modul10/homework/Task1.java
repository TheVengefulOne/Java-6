package main.java.com.Alexandr.practice.modul10.homework;

/**
 * Created by admin on 18.10.2017.
 */
public class Task1 {
    public static void main(String[] args) {
        try{
            throw new ClassCastException();
        } catch (Exception e) {
            System.out.println("catch");
        }finally {
            System.out.println("finally");

        }


    }
}

