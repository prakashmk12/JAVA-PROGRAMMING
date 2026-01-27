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
public class EXNO02
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter two number: ");
        int a = scan.nextInt();
        System.out.print("Largest number: ");
        int b = scan.nextInt();
        int big = (a > b) ? a : b;
        System.out.println("Largest = " + big);
    }
}