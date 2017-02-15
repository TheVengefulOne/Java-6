package main.java.com.Alexandr.practice.modul03.task003;

/**
 * Created by Natus Vincere on 15.02.2017.
 */
public class CollegeStudent extends Student {
    private String collegeName;
    private int rating;
    private long id;

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCollegeName() {

        return collegeName;
    }

    public int getRating() {
        return rating;
    }

    public long getId() {
        return id;
    }

    public CollegeStudent() {

    }

    public CollegeStudent(String collegeName, int rating, long id) {

        this.collegeName = collegeName;
        this.rating = rating;
        this.id = id;
    }
}
