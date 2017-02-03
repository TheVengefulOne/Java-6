package module2;

/**
 * Created by Natus Vincere on 03.02.2017.
 */
public class Massive {

    public static void main(String[] args) {
        double [] array = {1.2,1.6,5.7,7.8,1.3, -1.6, -5.5};
        double max = array[0], min = array[0];
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
