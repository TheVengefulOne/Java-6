package module2.HomeWork21;

/**
 * Created by Natus Vincere on 03.02.2017.
 */
public class HomeWork21d {
    public static void main(String[] args) {
        int [] array = {12,1,5,7,13, -1, -5};
        int max = array[0], min = array[0];
        for(int i = 0; i<array.length; i++){
            if(max<array[i])
                max = array[i];
            if(min>array[i])
                min = array[i];
        }
        System.out.println("Максимальное число: "+max);
        System.out.println("Минимальное число:"+min);
    }
    }