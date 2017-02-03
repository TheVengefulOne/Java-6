package module2.HomeWork21;

/**
 * Created by Natus Vincere on 03.02.2017.
 */
public class sumArray {
    public static void main(String[] args) {
        int[] Array= {10,20,30,40,50,60,70,80,90,100};
        int sum = 0;
        for (int i = 0; i <Array.length ; i++) {
            sum = sum +Array[i];


        }
        System.out.println("Сумма всех чисел: " + sum);
    }
}
