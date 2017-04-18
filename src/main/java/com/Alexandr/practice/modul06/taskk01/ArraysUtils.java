package main.java.com.Alexandr.practice.modul06.taskk01;

/**
 * Created by admin on 23.03.2017.
 */
public class ArraysUtils {
    public static int sum (int array[]){
        int a = 0;
        for (int i : array)
            a += i;

        return a;

    }

    public static int min (int array[]) {
        int c = array[0];
        for (int i = 0; i < array.length; i++) {
            if (c > array[i])
                c = array[i];

        }
        return c;
    }

    public static int max (int array[]) {
        int a = array[0];
        for (int i = 0; i < array.length; i++) {
            if (a < array[i])
                a = array[i];
        }
        return a;
    }

    public static int maxPositive(int array[]){
        int a = 0;
        for (int number : array) {
            if (number > 0 && a < number)
                a = number;

        }
        return a;

    }

    public static int multiplication(int array[]) {
        int mult = 1;
        for (int number : array) {
            mult *= number;

        }
        return mult;
    }

    public static int modlulus(int array[]){
        int q = 0;
        if (array[array.length-1] != 0){
            q = array[0] % array[array.length-1];

        }
        return q;
    }

    public static int secondLargest(int array[]){
        int largest = array[0];
        int secondLargest = array[0];
        for (int number : array)
            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest)
                secondLargest = number;
        return secondLargest;

    }

    public static int[] reverse(int array[]){
        for(int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return array;

    }
    public static int[] findEvenElements(int[] array){
        int count = 0;
        for (int elem : array) {
            if (elem % 2 == 0) {
                count++;
            }
        }
        int[] evens = new int[count];
        int index = 0;
        for (int elem : array) {
            if (elem % 2 == 0) {
                evens[index] = elem;
                index++;
            }
        }
        return evens;

    }


}
