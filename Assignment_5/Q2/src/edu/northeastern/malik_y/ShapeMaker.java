package edu.northeastern.malik_y;

public class ShapeMaker {
    Shape circle;
    Shape rectangle;
    Shape square;

    //constructor
    public ShapeMaker(){
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle(){
        circle.draw();
    }

    public void drawRectangle(){
        rectangle.draw();
    }

    public void drawSquare(){
        square.draw();
    }
}
