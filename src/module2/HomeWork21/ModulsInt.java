package module2.HomeWork21;

/**
 * Created by Natus Vincere on 03.02.2017.
 */
public class ModulsInt {
    public static void main(String[] args) {
        int[]Array = {33,22,45,12,56,89,21,65,66,98};
        int first = Array[0];
        int last = Array[Array.length - 1];
        System.out.println("First: " + Math.abs(first));
        System.out.println("Last: " + Math.abs(last));
    }
}
