package main.java.com.Alexandr.practice.modul06.Vebinar6.StaticBlockExample;

/**
 * Created by admin on 17.03.2017.
 */
public class StaticBlockExample {
    private static int aInt;
    private static int bInt = aInt;


    // static block
    static {
        for (int i = 0; i < 10 ; i++) {
            i += aInt;

        }
    }
    private int value;

    public int getValue() {
        return aInt;
    }

    public static int getaInt() {

        return aInt;
    }
}
