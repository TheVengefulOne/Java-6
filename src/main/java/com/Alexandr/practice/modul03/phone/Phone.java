package main.java.com.Alexandr.practice.modul03.phone;

/**
 * Created by Natus Vincere on 09.02.2017.
 */
public class Phone {
    private String manufacture;
    private String operatingSystem;
    private String model;
    int cost;

    public Phone(String joraz){
    }
    public Phone(int cost, String model, String manufacture){
        this.cost = cost;
        this.manufacture = manufacture;
        this.model = model;
    }
    static void test(){
        System.out.println("test");
    }

    public static void main(String[] args) {
        test();;
    }

    public String getManufacture() {
        return manufacture;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public String getModel() {
        return model;
    }

    public int getCost() {
        return cost;
    }

    public void setOperatingSystem(String operatingSystem) {

        this.operatingSystem = operatingSystem;
    }

    public void setCost(int cost) {

        this.cost = cost;
    }

    public void setModel(String model) {

        this.model = model;
    }

    public void setManufacture(String manufacture) {

        this.manufacture = manufacture;
    }
}
