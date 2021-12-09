package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;
import java.util.Scanner;

public class DrivingLicenseApplication {

    public static void main(String[] args) throws ParseException {
        System.out.println("--Question 2--");

        System.out.println("Enter Date of Birth (YYYY-MM-DD): ");
        Scanner s = new Scanner(System.in);
        String DOB = s.nextLine();

        try{
            Date dob = new SimpleDateFormat("yyyy-MM-dd").parse(DOB);
            LocalDate today = LocalDate.now();
            LocalDate date = dob.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            Period period = Period.between(date, today);

            if(period.getYears() < 16) {
                String age = String.valueOf(period.getYears());
                throw new Exception(age);
            }
            else {
                System.out.println("You can apply for a driving license.");
            }
        }
        catch(Exception e) {
            System.out.println("The age of the applicant is "+e.getMessage() +" " +
                    "which is too early to apply for a driving license.");
        }
    }
}
