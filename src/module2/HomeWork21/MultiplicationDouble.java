package module2.HomeWork21;

/**
 * Created by Natus Vincere on 03.02.2017.
 */
public class MultiplicationDouble {
    public static void main(String[] args) {
        double Array [] = {1.2,2.1,3.4,4.7,5.8,6.1,7.4,8.2,9.1,11.2};
        double mult = 1;
        for(double number : Array)
            mult *= number;
        System.out.println("Multiplication is: " + mult);

    }
}
