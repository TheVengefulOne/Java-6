package main.java.com.Alexandr.practice.modul02.task001;

/**
 * Created by Natus Vincere on 06.02.2017.
 */
public class CalculateOfArrays { public static void main(String[] args) {
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
    Array1[3] = 1.2;
    Array1[4] = 5.1;
    Array1[5] = 1.1;
    Array1[6] = 4.1;
    Array1[7] = 2.9;
    Array1[8] = 3.2;
    Array1[9] = -1.2;
    int[] Array2 = new int[3];
    Array[0]= -1;
    Array[1]= -3;
    Array[2]= -10;

    CalculateOfArrays calculateOfArrays = new CalculateOfArrays();
    calculateOfArrays.sum(Array);
    calculateOfArrays.sum(Array1);
    calculateOfArrays.min(Array);
    calculateOfArrays.min(Array1);
    calculateOfArrays.max(Array);
    calculateOfArrays.max(Array1);
    calculateOfArrays.maxPositive(Array2);
    calculateOfArrays.maxPositive(Array1);
    calculateOfArrays.multiplication(Array);
    calculateOfArrays.multiplication(Array1);
    calculateOfArrays.modulus(Array);
    calculateOfArrays.modulus(Array1);
    calculateOfArrays.secondLargest(Array);
    calculateOfArrays.secondLargest(Array1);
}

    public void sum(int Array[]) {

        int a = 0;
        for (int i : Array)
            a += i;
        System.out.println("Сумма всех целых чисел: " + a);
    }
    public void sum(double Array1[]) {
        double b = 0;
        for (double ball : Array1)
            b += ball;
        System.out.println("Сумма всех дробных чисел: " + b);
    }
    public void min(int Array[]) {
        int c = Array[0];
        for (int i = 0; i < Array.length; i++) {
            if (c > Array[i])
                c = Array[i];
        }
        System.out.println("Минимальное целое число: " + c);
    }
    public void min(double Array1[]) {
        double a = Array1[0];
        for (int i = 0; i < Array1.length; i++) {
            if (a > Array1[i])
                a = Array1[i];
        }
        System.out.println("Минимальное дробное число: " + a);
    }
    public void max(int Array[]) {
        int a = Array[0];
        for (int i = 0; i < Array.length; i++) {
            if (a < Array[i])
                a = Array[i];
        }
        System.out.println("Максимальное число: " + a);
    }
    public void max(double Array1[]) {
        double a = Array1[0];
        for (int i = 0; i < Array1.length; i++) {
            if (a < Array1[i])
                a = Array1[i];
        }
        System.out.println("Максимальное дробное число: " + a);
    }
    public void maxPositive(int Array2[]) {
        int a = 0;
        for (int number : Array2) {
            if (number > 0 && a < number)
                a = number;
        }
        System.out.println("Положительных значений нет :( " + a);
    }
    public void maxPositive(double Array1[]) {
        double a = 0;
        for (double number : Array1) {
            if (number > 0 && a < number)
                a = number;
        }
        System.out.println("Максимальное дробное позитивное число: " + a);
    }
    public void multiplication(int Array[]) {
        int mult = 1;
        for (int number : Array) {
            mult *= number;
        }
        System.out.println("Multiplication for int: " + mult);
    }
    public void multiplication(double Array1[]) {
        double mult = 1;
        for (double number : Array1) {
            mult *= number;
        }
        System.out.println("Multiplication for double: " + mult);
    }
    public void modulus(int Array[]) {
        int first = Array[0];
        int last = Array[Array.length - 1];
        System.out.println("Модуль первого числа: " + Math.abs(first));
        System.out.println("Модуль ппоследнего числа: " + Math.abs(last));
    }
    public void modulus(double Array[]) {
        double first = Array[0];
        double last = Array[Array.length - 1];
        System.out.println("Модуль первого дробного числа: " + Math.abs(first));
        System.out.println("Модуль последнего дробного числа: " + Math.abs(first));
    }
    public void secondLargest(int Array[]) {
        int Largest = Array[0];
        int SecondLargest = Array[0];
        for (int number : Array)
            if (number > Largest) {
                SecondLargest = Largest;
                Largest = number;
            } else if (number > SecondLargest)
                SecondLargest = number;
        System.out.println("Второе целое число: " + SecondLargest);
    }
    public void secondLargest(double Array1[]) {
        double Largest = Array1[0];
        double SecondLargest = Array1[0];
        for (double number : Array1)
            if (number > Largest) {
                SecondLargest = Largest;
                Largest = number;
            } else if (number > SecondLargest)
                SecondLargest = number;
        System.out.println("Второе дробное число: " + SecondLargest);
    }
}
