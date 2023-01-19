package com.ramsay.oop;

/*
This code sets up the abstract class called shape with the classes
rectangle and circle that extends from the shape super class.
The shapes share the line width and fill color attributes.
The area method is different for each shape.
*/

public abstract class Shape {
    private int lineWidth;
    private String fillColor;
    protected int getLineWidth() {
        return lineWidth;
    }
    protected String getFillColor() {
        return fillColor;
        }
    public abstract double getArea();
    public abstract void draw();

    public static void main (String args []) {
    }

public class Rectangle extends  Shape {
    private double width;
    private double height;
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle with width " + width + " height" + height
                + " with fill color " + getFillColor()
                + " with line width " + getLineWidth());
    }
}
public class Circle extends Shape {

    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return 3.14 * radius * radius;
    }

    @Override    public void draw() {
        System.out.println("Drawing a Circle with " + radius
                + " with fill color " + getFillColor()
                + " with line width " + getLineWidth());
    }
}

    }



