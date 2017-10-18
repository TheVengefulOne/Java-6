package main.java.com.Alexandr.practice.modul10.homework.task5;

/**
 * Created by admin on 18.10.2017.
 */
public class FirstException extends Exception {
    private String e;

    public FirstException(String e) {
        this.e = e;
    }

    @Override
    public String toString() {
        return "FirstException{" +
                "e='" + e + '\'' +
                '}';
    }
}
