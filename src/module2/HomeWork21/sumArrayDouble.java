package module2.HomeWork21;

/**
 * Created by Natus Vincere on 03.02.2017.
 */
public class sumArrayDouble {
    public static void main(String[] args) {
        double[] Array= {1.1,2.2,3.3,4.3,5.2,6.1,7.7,8.5,9.5,12.1};
        double sum = 0;
        for (int i = 0; i <Array.length ; i++) {
            sum = sum +Array[i];


        }
        System.out.printf("Максимальное число: "+sum);
    }
}
