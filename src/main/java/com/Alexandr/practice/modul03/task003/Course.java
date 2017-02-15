package main.java.com.Alexandr.practice.modul03.task003;

import java.util.Date;

/**
 * Created by Natus Vincere on 15.02.2017.
 */
public class Course {
    private Date startDate;
    private String name;
    private int hoursDuration;
    private String teacherName;

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHoursDuration(int hoursDuration) {
        this.hoursDuration = hoursDuration;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public Date getStartDate() {

        return startDate;
    }

    public String getName() {
        return name;
    }

    public int getHoursDuration() {
        return hoursDuration;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public Course(String name, int hoursDuration, String teacherName) {

        this.name = name;
        this.hoursDuration = hoursDuration;
        this.teacherName = teacherName;
    }

    public Course(Date startDate, String name) {

        this.startDate = startDate;
        this.name = name;
    }
}
