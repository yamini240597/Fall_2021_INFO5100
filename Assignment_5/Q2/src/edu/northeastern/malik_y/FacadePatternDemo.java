package edu.northeastern.malik_y;

public class FacadePatternDemo {

    public static void main(String[] args) {
	// Question 2 - Facade Pattern
        System.out.println("--Question 2--");

        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
