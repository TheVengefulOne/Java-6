package main.java.com.Alexandr.practice.modul05.zadacha2;

/**
 * Created by admin on 23.02.2017.
 */
public class UseWorkers {
    public static void main(String[] args) {
        Worker[] array = new Worker[100];

        for (int i = 0; i <array.length; i++) {
            array[i] = new Worker(1000 * i);

        }
        int sum = 0;

        for (Worker worker : array){
            sum += worker.getSalary();

        }
        System.out.println("SUM: " + sum);


    }
}
