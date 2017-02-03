package module2.HomeWork21;

/**
 * Created by Natus Vincere on 03.02.2017.
 */
public class SecondLargestInt {
    public static void main(String[] args) {
        int[] Array = {45,22,67,76,89,98,31,12,34,100};
        int Largest = Array[0];
        int SecondLargest = Array[0];
        for(int number : Array)
            if(number > Largest){
                SecondLargest = Largest;
                Largest = number;

            }else if(number > SecondLargest)
                SecondLargest = number;
        System.out.println("Второе максимальное число в массиве: " + SecondLargest);


    }
}
