package edu.northeastern.malik_y;

public class Main {

    public static void main(String[] args) {
        //question 1
        //example 1
        System.out.println("Example 1");
        System.out.println("Shape 1");
        Shape shape1 = new Shape("Shape 1", "Pink");
        System.out.println(shape1.printShape());
        System.out.println();

        //example 2
        System.out.println("Example 2");
        System.out.println("Shape 2");
        Shape shape2 = new Shape("Shape 2", "Orange", 20, 30);
        System.out.println("The area is: " + shape2.getArea() + " Perimeter: " + shape2.getPerimeter());
        System.out.println(shape2.printShape());
        System.out.println();

        //example 3
        System.out.println("Example 3");
        System.out.println("Rectangle 1");
        Rectangle rectangle1 = new Rectangle(2);
        System.out.println("The area is: " + rectangle1.getArea() + " Perimeter: " + rectangle1.getPerimeter());
        System.out.println();

        //example 4
        System.out.println("Example 4");
        System.out.println("Rectangle 2");
        Rectangle rectangle2 = new Rectangle("Rectangle", "Purple", 4, 7);
        System.out.println("The area is: " + rectangle2.getArea() + " Perimeter: " + rectangle2.getPerimeter());
        System.out.println(rectangle2.printShape());
        System.out.println();

        //example 5
        System.out.println("Example 5");
        System.out.println("Square 1");
        Square square1 = new Square(3);
        System.out.println("The area is: " + square1.getArea() + " Perimeter: " + square1.getPerimeter());
        System.out.println();

        //example 6
        System.out.println("Example 6");
        System.out.println("Square 2");
        Square square2 = new Square("Square", "Black", 7);
        System.out.println("Area: " + square2.getArea() + " Perimeter: " + square2.getPerimeter());
        System.out.println(square2.printShape());

    }
}
