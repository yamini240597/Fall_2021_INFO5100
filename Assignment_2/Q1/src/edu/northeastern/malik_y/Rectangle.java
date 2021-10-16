package edu.northeastern.malik_y;

public class Rectangle extends Shape{
    public int height;
    public int width;
    public int side;

    //constructors
    public Rectangle(int side) {
        this.height = side;
        this.width = side;
    }

    public Rectangle(String name, String color, int height, int width) {
        super(name, color);
        this.height = height;
        this.width = width;
    }

    //getters and setters
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public int getArea(){
        return height*width;
    }

    @Override
    public int getPerimeter(){
        return 2*(height+width);
    }
}
