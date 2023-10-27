package edu.geometry.shape;

import edu.geometry.Shape;


public class Triangle implements Shape {
    private  double side1;
    private  double side2;
    private  double degree;

    public Triangle(double side1, double side2, double degree) {
        if(side1 <= 0 || side2 <= 0 || degree <= 0) {
            throw new IllegalArgumentException("All entries must be positive");
        }
        this.side1 = side1;
        this.side2 = side2;
        this.degree = degree;
    }


    public double area() {
        double radians = Math.toRadians(degree);
        return (side1 * side2) / 2 * Math.sin(radians);
    }


    public double perimeter() {
        return 0;
    }
}
