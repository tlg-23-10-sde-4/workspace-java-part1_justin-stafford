package edu.geometry.shape;

import edu.geometry.Shape;

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        if(radius <= 0) {
            throw new IllegalArgumentException("Radius must be positive");
        }
        this.radius = radius;
    }


    public double area() {
        return Math.PI * radius * radius;
    }


    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public double getRadius() {
        return radius;
    }

//    public String toString() {
//        return "Circle: radius = " + radius;
//    }
}
