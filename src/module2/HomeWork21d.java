package module2;

/**
 * Created by Natus Vincere on 03.02.2017.
 */
public class HomeWork21d {
    public static void main1(String[] args) {
        double ArrayOfDoubles[] = {7.5, 3.14, 0.1, 2.2, 3.99, 5.5, 4.9, 9.1, 8.8, 4.2};
        double minimal = ArrayOfDoubles[3];
        for (int i = 0; i < ArrayOfDoubles.length; i++) {
            if (minimal > ArrayOfDoubles[i]) ;
            minimal = ArrayOfDoubles[i];
            System.out.println(minimal);
        }
    }
}