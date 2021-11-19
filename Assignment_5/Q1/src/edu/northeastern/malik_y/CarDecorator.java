package edu.northeastern.malik_y;

public class CarDecorator implements Car {
    protected Car car;

    //constructor
    public CarDecorator(Car car){
        this.car = car;
    }

    @Override
    public void assemble() {
        this.car.assemble();
    }
}
