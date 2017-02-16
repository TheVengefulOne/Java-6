package main.java.com.Alexandr.practice.modul03.OOP;

/**
 * Created by Natus Vincere on 08.02.2017.
 */
public class Vebinars {
    public Vebinars(int age) {
        this.age = age;
    }

    private long id;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    private String name;
    private int age;
    private String companyName;

    public Vebinars(long id, String name, int age, String companyName) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.companyName = companyName;
    }


}
