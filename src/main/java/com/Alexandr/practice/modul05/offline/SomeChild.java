package main.java.com.Alexandr.practice.modul05.offline;

import main.java.com.Alexandr.practice.modul05.offline.SomeParent;

/**
 * Created by admin on 23.02.2017.
 */
public class SomeChild extends SomeParent {
    private String name = "Sanya";
    private String secondName;


   private int years = calculate();



    {
        System.out.println(className + "init block");
        System.out.println(className + "secondName: " + secondName);
        secondName = name + years;
        System.out.println(className + "secondName: " + secondName);
    }




    private int calculate(){
        System.out.println(className + "Calculate method");
        return 17;
    }

}
