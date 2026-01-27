/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PROGRAM;

/**
 *
 * @author Student
 */
import java.util.Scanner;
interface Shape {
    double getArea();
}
class Rectangle implements Shape {
    double length, breadth;
    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }
    public double getArea() {
        return length * breadth;
    }
}
class Circle implements Shape {
    double radius;
    Circle(double r) {
        radius = r;
    }
    public double getArea() {
        return (22.0 / 7.0) * radius * radius;
    }
}
class Triangle implements Shape {
    double base, height;
    Triangle(double b, double h) {
        base = b;
        height = h;
    }
    public double getArea() {
        return 0.5 * base * height;
    }
}
public class EXNO09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Length of Rectangle: ");
        double rectLength = scanner.nextDouble();
        System.out.print("Enter Breadth of Rectangle: ");
        double rectBreadth = scanner.nextDouble();
        Shape rectangle = new Rectangle(rectLength, rectBreadth);
        System.out.print("Enter Radius of Circle: ");
        double circleRadius = scanner.nextDouble();
        Shape circle = new Circle(circleRadius);
        System.out.print("Enter Base of Triangle: ");
        double triangleBase = scanner.nextDouble();
        System.out.print("Enter Height of Triangle: ");
        double triangleHeight = scanner.nextDouble();
        Shape triangle = new Triangle(triangleBase, triangleHeight);
        System.out.println("\nArea of Rectangle: " + rectangle.getArea());
        System.out.println("Area of Circle: " + circle.getArea());
        System.out.println("Area of Triangle: " + triangle.getArea());
        scanner.close();
    }
}
