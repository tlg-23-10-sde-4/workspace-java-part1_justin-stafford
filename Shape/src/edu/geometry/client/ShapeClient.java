package edu.geometry.client;

import edu.geometry.Shape;
import edu.geometry.shape.Circle;
import edu.geometry.shape.Rectangle;
import edu.geometry.shape.Triangle;


public class ShapeClient {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(5),
                new Rectangle(4, 6),
                new Triangle(10, 15, 90),
                };

        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                System.out.println("Circle in inches squared:");
            }
            else if (shape instanceof Rectangle) {
                System.out.println("Rectangle in inches squared:");
            }
            else if(shape instanceof Triangle) {
                System.out.println("Triangle in inches squared:");
           }
            System.out.printf("Area: %.3f,  Perimeter: %.3f\n", shape.area(), shape.perimeter());
            System.out.println(); // for readability
        }
    }
}