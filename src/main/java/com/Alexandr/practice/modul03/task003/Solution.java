package main.java.com.Alexandr.practice.modul03.task003;


import java.util.Calendar;
import java.util.Date;

/**
 * Created by Natus Vincere on 15.02.2017.
 */
public class Solution {
    public static void main(String[] args) {
        Date date = new Date(20);
        Course [] cor = {};

        Course course1 = new Course("Name", 1001,"Grisha");
        Course course2 = new Course (date,"Name");
        // Я не понимаю зачем делать эту операцию, если мы уже воспользовались конструктором
        // Course course3 = new Course
        // Course course4 = new Course
        // Course course5 = new Course
        CollegeStudent collegeStudent = new CollegeStudent("Name", 11,1001);
        SpecialStudent specialStudent = new SpecialStudent(10001,"Name");
        Student student = new Student("Name","Name",22);
        Student student1 = new Student("Name",cor);
        // Так же не понимаю как это сделать здесь






    }
}
