package module2.HomeWork21;

/**
 * Created by Natus Vincere on 03.02.2017.
 */
public class MaxPositiveDouble {
    public static void main(String[] args) {
        double[] Array = {-4.2,54.5,2.2,-5.6,22.1,-11.6,32.7,21.1,30.2,45.3};
        double MaxPositive = 0;
        for(double number : Array)
            if(number > 0&& MaxPositive< number)
                MaxPositive = number;
        System.out.println(MaxPositive);
    }
}
