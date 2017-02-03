package module2.HomeWork21;

/**
 * Created by Natus Vincere on 03.02.2017.
 */
public class MaxPositiveInt {
    public static void main(String[] args) {
        int[] Array = {-4,54,2,-5,22,-11,32,21,30,45};
        int MaxPositive = 0;
        for(int number : Array)
            if(number > 0&& MaxPositive< number)
                MaxPositive = number;
        System.out.println(MaxPositive);

    }
}
