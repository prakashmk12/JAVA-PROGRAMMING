import java.util.Scanner;
class EXNO03 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        float r = sc.nextFloat();

        System.out.println("The radius of a circle is: " + r);
        float area = (float)22/7 * r * r;
        System.out.println("The area of a circle: " + area);
    }

}
