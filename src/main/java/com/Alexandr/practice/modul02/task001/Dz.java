package main.java.com.Alexandr.practice.modul02.task001;

/**
 * Created by Natus Vincere on 06.02.2017.
 */
public class Dz {
    public static void main(String[] args) {
        int[] Array = new int[10];
        Array[0] = -5;
        Array[1] = 8;
        Array[2] = 11;
        Array[3] = 22;
        Array[4] = 21;
        Array[5] = 3;
        Array[6] = 6;
        Array[7] = 9;
        Array[8] = 3;
        Array[9] = -2;
        double[] Array1 = new double[10];
        Array1[0] = -2.5;
        Array1[1] = 4.1;
        Array1[2] = 2.1;
        Array1[3] = 1.1;
        Array1[4] = 5.1;
        Array1[5] = 1.1;
        Array1[6] = 4.1;
        Array1[7] = 1.9;
        Array1[8] = 3.2;
        Array1[9] = -1.2;


        System.out.println("Сумма всех целых чисел: " + sum(Array));
        System.out.println("Сумма всех дробных чисел: " + sum(Array1));
        System.out.println("Минимальное целое число: " + min(Array));
        System.out.println("Минимальное дробное число: " + min(Array1));
        System.out.println("Максимальное число: " + max(Array));
        System.out.println("Максимальное дробное число: " + max(Array1));
        System.out.println("Максимальное позитивное число: " + maxPositive(Array));
        System.out.println("Максимальное позитивное дробное число: " + maxPositive(Array1));
        System.out.println("Multiplication for int: " + multiplication(Array));
        System.out.println("Multiplication for double: " + multiplication(Array1));
        System.out.println("Модуль первого целого числа: " + modulus(Array));
        System.out.println("Модуль последнего дробного числа: " + modulus(Array1));
        System.out.println("Модуль последнего целого числа: "+modulus1(Array));
        System.out.println("Модуль первого дробного числа: "+modulus1(Array1));
        System.out.println("Второе целое число: "+secondLargest(Array));
        System.out.println("Второе дробное число: "+secondLargest(Array1));


    }


    public static int sum(int Array[]) {

        int a = 0;
        for (int i : Array) {
            a += i;


        }
        return a;
    }

    public static double sum(double Array1[]) {
        int b = 0;
        for (double ball : Array1) {
            b += ball;
        }
        return b;
    }

    public static int min(int Array[]) {
        int a = Array[0];
        for (int i = 0; i < Array.length; i++) {
            if (a > Array[i])
                a = Array[i];
        }
        return a;


    }

    public static double min(double Array1[]) {
        double a = Array1[0];
        for (int i = 0; i < Array1.length; i++) {
            if (a > Array1[i])
                a = Array1[i];


        }
        return a;

    }

    public static int max(int Array[]) {
        int a = Array[0];
        for (int i = 0; i < Array.length; i++) {
            if (a < Array[i])
                a = Array[i];

        }
        return a;
    }

    public static double max(double Array1[]) {
        double a = Array1[0];
        for (int i = 0; i < Array1.length; i++) {
            if (a < Array1[i])
                a = Array1[i];


        }
        return a;
    }

    public static int maxPositive(int Array[]) {
        int a = 0;
        for (int number : Array) {
            if (number > 0 && a < number)
                a = number;
        }
        return a;
    }

    public static double maxPositive(double Array1[]) {
        double a = 0;
        for (double number : Array1) {
            if (number > 0 && a < number)
                a = number;
        }
        return a;

    }

    public static int multiplication(int Array[]) {
        int mult = 1;
        for (int number : Array) {
            mult *= number;

        }
        return mult;
    }

    public static double multiplication(double Array1[]) {
        double mult = 1;
        for (double number : Array1) {
            mult *= number;
        }
        return mult;

    }

    public static int modulus(int Array[]) {

        int first = Array[0];
        int last = Array[Array.length - 1];
        {
        }
        return Math.abs(first);


    }

    public static double modulus(double Array[]) {

        double first = Array[0];
        double last = Array[Array.length - 1];
        {
        }
        return Math.abs(last);

    }

    public static int modulus1(int Array[]) {

        int first = Array[0];
        int last = Array[Array.length - 1];
        {
        }
        return Math.abs(last);
    }
    public static double modulus1(double Array[]) {

        double first = Array[0];
        double last = Array[Array.length - 1];
        {
        }
        return Math.abs(first);

    }
    public static int secondLargest (int Array[]){
        int Largest = Array[0];
        int SecondLargest = Array[0];
        for(int number : Array)
            if(number > Largest){
                SecondLargest = Largest;
                Largest = number;

            }else if(number > SecondLargest)
                SecondLargest = number;{} return SecondLargest;
    }
    public static double secondLargest (double Array1[]){
        double Largest = Array1[0];
        double SecondLargest = Array1[0];
        for(double number : Array1)
            if(number > Largest){
                SecondLargest = Largest;
                Largest = number;

            }else if(number > SecondLargest)
                SecondLargest = number;{} return SecondLargest;
    }
}







