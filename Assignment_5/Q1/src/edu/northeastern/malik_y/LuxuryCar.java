package edu.northeastern.malik_y;

public class LuxuryCar extends CarDecorator {
    //constructor
    public LuxuryCar(Car car) {
        super(car);
    }

    @Override
    public void assemble(){
        super.assemble();
        System.out.print("Adding deatures of Luxury Car. ");
    }
}
