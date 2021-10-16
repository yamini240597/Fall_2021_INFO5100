package edu.northeastern.malik_y;

public class Square extends Shape {
    public int side;

    //constructor
    public Square(int side) {
        this.side = side;
    }

    public Square(String name, String color, int side) {
        super(name, color);
        this.side = side;
    }

    //getters and setters
    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public int getArea(){
        return side*side;
    }

    @Override
    public int getPerimeter(){
        return 4*side;
    }
}
