package edu.geometry.shape;

import edu.geometry.Shape;

public class Rectangle implements Shape {
    private double width;
    private double length;
    
    public Rectangle(double width, double length) {
        if (width <= 0 || length <= 0) {
            throw new IllegalArgumentException("You should probably make your width and length positive");
        }
        this.width = width;
        this.length = length;
    }

    @Override
    public double area() {
        return width * length;
    }

    public double perimeter() {
        return 2 * (width + length);
    }
    
//
//  public String toString() {
//     return "Rectangle{" + "width=" + width + ", length=" + length + '}';
//    }

}
