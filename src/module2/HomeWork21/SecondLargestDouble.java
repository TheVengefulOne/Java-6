package module2.HomeWork21;

/**
 * Created by Natus Vincere on 03.02.2017.
 */
public class SecondLargestDouble {
    public static void main(String[] args) {
        double[] Array = {4.5,2.2,6.7,7.6,8.9,9.8,3.1,1.2,3.4,1.2};
        double Largest = Array[0];
        double SecondLargest = Array[0];
        for(double number : Array)
            if(number > Largest){
                SecondLargest = Largest;
                Largest = number;

            }else if(number > SecondLargest)
                SecondLargest = number;
        System.out.println("Второе максимальное число в массиве: " + SecondLargest);

    }
}
