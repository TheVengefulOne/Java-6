package main.java.com.Alexandr.practice.modul10.homework;

/**
 * Created by admin on 18.10.2017.
 */
public class Task4 {
    public static void main(String[] args) {
try {
    f();
} catch (ClassCastException e){
    throw new ArithmeticException();
}
    }
    private static void f(){
        g();
    }
    private static void g(){
        throw new ClassCastException();
    }
}
