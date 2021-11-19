package edu.northeastern.malik_y;

public class DecoratorPatternTest {

    public static void main(String[] args) {
	//Question 1 - Decorator Pattern
        System.out.println("--Question 1--");

        Car sportsCar = new SportsCar(new BasicCar()); sportsCar.assemble();
        System.out.println("\n");

        Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
        sportsLuxuryCar.assemble();
    }
}
