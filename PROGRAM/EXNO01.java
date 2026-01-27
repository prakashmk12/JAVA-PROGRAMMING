/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PROGRAM;

/**
 *
 * @author Kavinkumar
 */
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