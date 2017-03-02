package main.java.com.Alexandr.practice.modul04.writers;

/**
 * Created by admin on 19.02.2017.
 */
public abstract class PenWriter implements Writer {
    private int amount;

    public PenWriter(int amount) {
        this.amount = amount;
    }
    public void write(String str){
        System.out.println("Write Pen");
        writePen(str);
        
    }
    public abstract void writePen(String str);

  

  
}
