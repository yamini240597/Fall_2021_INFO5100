package edu.northeastern.malik_y;

public class SportsCar extends CarDecorator{
    //constructor
    public SportsCar(Car car) {
        super(car);
    }

    @Override
    public void assemble(){
        super.assemble();
        System.out.print("Adding features of Sports Car. ");
    }
}
