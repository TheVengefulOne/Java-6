package main.java.com.Alexandr.practice.modul05.offline;

/**
 * Created by admin on 23.02.2017.
 */
public class SomeParent {
    protected String className = "[ Parent ]";
    private int yearsParent = calculateParentYears();

    public SomeParent(int years) {

    }

    private int calculateParentYears(){
        System.out.println(className + "Calculate parent years method");
        return 100;
    }
    {
        System.out.println();
    }
    public SomeParent() {
        super();
    }
}
