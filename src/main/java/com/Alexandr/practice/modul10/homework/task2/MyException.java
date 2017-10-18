package main.java.com.Alexandr.practice.modul10.homework.task2;

/**
 * Created by admin on 18.10.2017.
 */
public class MyException extends Exception {
    String e;

    public MyException(String e){
        this.e = e;
    }

    @Override
    public String toString() {
        return "MyException{" +
                "e='" + e + '\'' +
                '}';
    }
}
