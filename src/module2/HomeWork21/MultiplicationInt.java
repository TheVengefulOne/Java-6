package module2.HomeWork21;

/**
 * Created by Natus Vincere on 03.02.2017.
 */
public class MultiplicationInt {
    public static void main(String[] args) {
        int Array [] = {1,2,3,4,5,6,7,8,9,10};
        int mult = 1;
        for(int number : Array)
            mult *= number;
        System.out.println("Multiplication is: " + mult);

    }
}
