package main.java.com.Alexandr.practice.modul10.homework.task5;

/**
 * Created by admin on 18.10.2017.
 */
public class SecondException extends Exception {
    private String e;

    public SecondException(String e) {
        this.e = e;
    }

    @Override
    public String toString() {
        return "SecondException{" +
                "e='" + e + '\'' +
                '}';
    }
}
