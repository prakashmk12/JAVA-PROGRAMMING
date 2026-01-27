package PROGRAM;  // Ensure this matches your package structure

import java.util.Scanner;

class Area {

    // Method to calculate the area of a rectangle or triangle using the same formula
    public double findArea(double length, double breadth) {
        return length * breadth;  // This works for both rectangle and triangle.
    }

    // Method to calculate the area of a square
    public double findArea(double side) {
        return side * side;
    }
}

public class EXNO07 {  // Make sure the main class is named Ex7

    public static void main(String[] args) {
        // Create a scanner to take user input
        Scanner scan = new Scanner(System.in);
        Area areaCalculator = new Area();  // Create an instance of Area class

        // Variables to store the dimensions and calculated areas
        double length, breadth, rectangleArea;
        double base, height, triangleArea;
        double side, squareArea;

        // Get input for the rectangle
        System.out.println("Enter the Length and Breadth of Rectangle:");
        length = scan.nextDouble();
        breadth = scan.nextDouble();
        rectangleArea = areaCalculator.findArea(length, breadth);  // Calculate rectangle area

        // Get input for the triangle (same as rectangle for simplicity)
        System.out.println("Enter the Base and Height of Triangle:");
        base = scan.nextDouble();
        height = scan.nextDouble();
        triangleArea = areaCalculator.findArea(base, height);  // Calculate triangle area

        // Get input for the square
        System.out.println("Enter the Side of Square:");
        side = scan.nextDouble();
        squareArea = areaCalculator.findArea(side);  // Calculate square area

        // Output the results
        System.out.println("Area of Rectangle: " + rectangleArea);
        System.out.println("Area of Triangle: " + triangleArea);
        System.out.println("Area of Square: " + squareArea);

        // Close the scanner
        scan.close();
    }
}