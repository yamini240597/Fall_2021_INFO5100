package edu.northeastern.malik_y;

public class Sum {
    int num1;
    int num2;
    int num3;
    double output;

    //default constructor
    public Sum() {
    }

    //getters and setters
    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum3() {
        return num3;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }

    public double getOutput() {
        return output;
    }

    public void setOutput(double output) {
        this.output = output;
    }

    //function overloading
    public int add(int num1, int num2, int num3){
        System.out.println("\nNum1: " + num1 + ", Num2: " + num2 + ", Num3: " + num3);
        System.out.println("Output: ");
        output = num1 + num2 + num3;
        return (int) output;
    }

    public int add(int num1, int num2){
        System.out.println("\nNum1: " + num1 + ", Num2: " + num2);
        System.out.println("Output: ");
        output = num1 + num2;
        return (int) output;
    }

    public double add(double num1, double num2){
        System.out.println("\nNum1: " + num1 + ", Num2: " + num2);
        System.out.println("Output: ");
        output = num1 + num2;
        return output;
    }

    public double add(int num1, double num2){
        System.out.println("\nNum1: " + num1 + ", Num2: " + num2);
        System.out.println("Output: ");
        output = num1 + num2;
        return output;
    }



}
