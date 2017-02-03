package module2.HomeWork21;

/**
 * Created by Natus Vincere on 03.02.2017.
 */
public class ModulsDouble {
    public static void main(String[] args) {
        double[]Array = {3.3,2.2,4.5,1.2,5.6,8.9,2.1,6.5,6.6,9.8};
        double first = Array[0];
        double last = Array[Array.length - 1];
        System.out.println("First: " + Math.abs(first));
        System.out.println("Last: " + Math.abs(last));
    }
}
