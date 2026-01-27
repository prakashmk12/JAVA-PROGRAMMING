import java.util.Scanner;
class Area {
    public double findArea(double length, double breadth) {
        return length * breadth; 
    }
    public double findArea(double side) {
        return side * side;
    }
}

public class EXNO07 {  

    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        Area areaCalculator = new Area();  
        double length, breadth, rectangleArea;
        double base, height, triangleArea;
        double side, squareArea;

        System.out.println("Enter the Length and Breadth of Rectangle:");
        length = scan.nextDouble();
        breadth = scan.nextDouble();
        rectangleArea = areaCalculator.findArea(length, breadth);  

        System.out.println("Enter the Base and Height of Triangle:");
        base = scan.nextDouble();
        height = scan.nextDouble();
        triangleArea = areaCalculator.findArea(base, height);  

        System.out.println("Enter the Side of Square:");
        side = scan.nextDouble();
        squareArea = areaCalculator.findArea(side);  

        System.out.println("Area of Rectangle: " + rectangleArea);
        System.out.println("Area of Triangle: " + triangleArea);
        System.out.println("Area of Square: " + squareArea);

        scan.close();
    }
}
