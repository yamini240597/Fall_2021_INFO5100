package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) throws ParseException {
        System.out.println("--Question 1--");
        List<Student> students = new ArrayList<Student>();

        Date date1 = new SimpleDateFormat("MM/ dd/ yy").parse("05/ 24/ 97");
        students.add(new Student(1, "Chad", 3.5, date1));

        Date date2 = new SimpleDateFormat("MM/ dd/ yy").parse("07/ 19/ 97");
        students.add(new Student(2, "Josh", 3.9, date2));

        Date date3 = new SimpleDateFormat("MM/ dd/ yy").parse("07/ 28/ 97");
        students.add(new Student(3, "Derek", 4.0, date3));

        Date date4 = new SimpleDateFormat("MM/ dd/ yy").parse("12/ 22/ 97");
        students.add(new Student(4, "Alice", 3.8, date4));

        Date date5 = new SimpleDateFormat("MM/ dd/ yy").parse("02/ 28/ 97");
        students.add(new Student(4, "Kim", 3.7, date5));

        System.out.println("Sort name by ascending order:");
        Collections.sort(students, new NameComparator());
        for (Student s1: students){
            System.out.println(s1.getName());
        }


        System.out.println("\nSort GPA by descending order:");
        Collections.sort(students, new GpaComparator());
        for (Student s1: students){
            System.out.println(s1.getGpa());
        }

        System.out.println("\nSort Date of Birth by ascending order:");
        Collections.sort(students, new DateOfBirthComparator());
        for (Student s1: students){
            System.out.println(s1.getDateOfBirth());
        }
    }
}
