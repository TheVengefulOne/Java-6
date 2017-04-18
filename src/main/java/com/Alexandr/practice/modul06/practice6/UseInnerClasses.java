package main.java.com.Alexandr.practice.modul06.practice6;

/**
 * Created by admin on 21.03.2017.
 */
public class UseInnerClasses {
    public static void main(String[] args) {
        Chart myChart = new Chart();
        myChart.init();
        myChart.drawChart();

        System.out.println(myChart.calculateWidtOfChart());
    }
}
