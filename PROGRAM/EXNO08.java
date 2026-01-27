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
class Shape {
    double getPerimeter() {
        return 0.0;
    }
    double getArea() {
        return 0.0;
    }
}
class Circle extends Shape {
    double radius;
    Circle(double r) {
        this.radius = r;
    }
    @Override
    double getPerimeter() {
        return 2 * (22.0 / 7.0) * radius;
    }
    @Override
    double getArea() {
        return (22.0 / 7.0) * radius * radius;
    }
}
public class EXNO08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Radius of Circle:");
        double rad = scan.nextDouble();
        Circle circle = new Circle(rad);
        System.out.println("Perimeter of the circle: " + circle.getPerimeter());
        System.out.println("Area of the circle: " + circle.getArea());
        scan.close();
    }
}