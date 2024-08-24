package app;

public class Main {
    // Method to calculate the total area of all shapes in the array
    public static double getTotalArea(Shape[] shapes) {
        double totalArea = 0;  // Initialize total area to 0
        // Loop through each shape in the array and sum their areas
        for (Shape shape : shapes) {
            totalArea += shape.getArea();
        }
        return totalArea;  // Return the calculated total area
    }

    public static void main(String[] args) {
        // Create an array of shapes (Circle, Triangle, Square)
        Shape[] shapes = {
                new Circle(5),    // Circle with radius 5
                new Triangle(3, 4), // Triangle with base 3 and height 4
                new Square(2)     // Square with side length 2
        };

        // Calculate the total area of all shapes in the array
        double totalArea = getTotalArea(shapes);
        // Print the total area to the console
        System.out.println("Total area of all shapes: " + totalArea);
    }
}