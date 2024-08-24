package app;

// Class representing a Circle that implements the Shape interface
public class Circle implements Shape {
    private double radius; // Instance variable to store the radius of the circle

    // Constructor to initialize the radius of the circle
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementation of the getArea method from the Shape interface
    // This method calculates and returns the area of the circle
    @Override
    public double getArea() {
        return Math.PI * radius * radius; // Area of the circle = π * r^2
    }
}