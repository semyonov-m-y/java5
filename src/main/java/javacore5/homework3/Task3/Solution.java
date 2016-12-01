package main.java.javacore5.homework3.Task3;

import java.util.Date;

public class Solution {

    public static void main(String[] args) {
        Date date = new Date();
        Course course0 = new Course(date, "course0");
        Course course1 = new Course(date, "course1");
        Course course2 = new Course(date, "course2");
        Course course3 = new Course(date, "course3");
        Course course4 = new Course(date, "course4");

        Student student0 = new Student("Max", "Semenov", 5);
        Student student1 = new Student("Semenov", new Course[0]);

        CollegeStudent collegeStudent0 = new CollegeStudent("Max", "Semenov", 5);
        CollegeStudent collegeStudent1 = new CollegeStudent("Semenov", new Course[0]);
        CollegeStudent collegeStudent2 = new CollegeStudent("Max", "Semenov", 5, "Maximiliano", 5, 7);

        SpecialStudent specialStudent0 = new SpecialStudent("Max", "Semenov", 5);
        SpecialStudent specialStudent1 = new SpecialStudent("Semenov", new Course[0]);
        SpecialStudent specialStudent2 = new SpecialStudent("Max", "Semenov", 5, 777);
    }
}
