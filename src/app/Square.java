package app;

// Class representing a Square that implements the Shape interface
public class Square implements Shape {
    private double side; // Instance variable to store the length of the square's side

    // Constructor to initialize the side length of the square
    public Square(double side) {
        this.side = side;
    }

    // Implementation of the getArea method from the Shape interface
    // This method calculates and returns the area of the square
    @Override
    public double getArea() {
        return side * side; // Area of the square = side * side
    }
}
