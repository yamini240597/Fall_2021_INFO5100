package edu.northeastern.malik_y;

public class Printer {
    //instance
    private static Printer _instance;

    //default constructor
    private Printer(){
    }

    //object
    private static Object obj = new Object();
    public String printerStatus = "Your Printer is working";

    //method
    public static Printer getInstance(){
        if (_instance == null){
            synchronized (obj){
                if (_instance == null){
                    _instance = new Printer();
                }
            }
        }
        return _instance;
    }

    public static void getConnection(){
        System.out.println("Output: " + _instance.printerStatus);
        System.out.println();
    }
}
