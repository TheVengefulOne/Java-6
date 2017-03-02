package main.java.com.Alexandr.practice.modul05.zadacha;

/**
 * Created by admin on 23.02.2017.
 */
public class Solution {
    public static void main(String[] args) {
        Convertor convertor = new Convertor(27.1);
        System.out.println("USD: " + convertor.convert(3000));
        System.out.println("USD: " + convertor.convert(5000));
        System.out.println("USD: " + convertor.convert(100000));
    }
}
