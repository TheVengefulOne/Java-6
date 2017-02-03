package module2;

/**
 * Created by Natus Vincere on 03.02.2017.
 */
public class HomeWork21 {
    public static void main(String[] args) {
        int[] ArrayOfInts = {1,20,3,40,50,60,70,80,90,100};
        int min = ArrayOfInts[0];
        for (int i = 0; i < ArrayOfInts.length ; i++) {
            if(min>ArrayOfInts[i])
                min = ArrayOfInts[i];
            System.out.println(min);

        }



    }

}
