import java.util.Scanner;
public class EXNO01
{
public static void main(String args[]) 
{
        float cel, far;
        Scanner S = new Scanner(System.in);
        System.out.println("Enter temperature in Celsius:");
        cel = S.nextFloat();
        far = cel*9/5+32;
        System.out.println("Temperature in Fahrenheit: " +far);
}

}
