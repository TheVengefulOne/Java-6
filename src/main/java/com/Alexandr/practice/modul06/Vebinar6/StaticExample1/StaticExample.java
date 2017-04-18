package main.java.com.Alexandr.practice.modul06.Vebinar6.StaticExample1;

/**
 * Created by admin on 17.03.2017.
 */
public class StaticExample {
    private static long value;
    protected static int intValue;

    public static void setValue(int value){
        StaticExample.value = value;
    }

    private int notStaticValue;

    public StaticExample(){
        this(intValue);
    }

    public StaticExample(int notStaticValue){
        this.notStaticValue = notStaticValue;

    }

    public String toString(){
        return "Static Example{ " + "notStaticValue " + notStaticValue + "}";
    }

}
