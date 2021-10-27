package edu.northeastern.malik_y;

public class Main {
    public static void main(String[] args) {
        //question 2
        System.out.println("--Question 2: Singleton Design Pattern--");
        Printer p1 = Printer.getInstance();
        p1.getConnection();
    }
}
