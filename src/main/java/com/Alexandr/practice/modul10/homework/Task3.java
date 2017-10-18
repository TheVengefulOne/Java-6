package main.java.com.Alexandr.practice.modul10.homework;

/**
 * Created by admin on 18.10.2017.
 */
public class Task3 {
    public static void main(String[] args) {
        Object object = null;
        try {
            object.notify();
        } catch (NullPointerException e){
            System.out.println("Complete");
        }
    }
}
