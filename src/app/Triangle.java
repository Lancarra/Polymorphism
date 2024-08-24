package app;

// Class representing a Triangle that implements the Shape interface
public class Triangle implements Shape {
    private double base;   // Instance variable to store the base length of the triangle
    private double height; // Instance variable to store the height of the triangle

    // Constructor to initialize the base and height of the triangle
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Implementation of the getArea method from the Shape interface
    // This method calculates and returns the area of the triangle
    @Override
    public double getArea() {
        return 0.5 * base * height; // Area of the triangle = 0.5 * base * height
    }
}
