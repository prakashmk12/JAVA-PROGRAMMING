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
public class EXNO04 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int marks[] = new int[5];
        int sum = 0; 
        double aver;
        System.out.println("Enter your tenth standard marks one by one:");
                     for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = s.nextInt();
            sum = sum + marks[i];  
        }
        aver = sum / 5.0;
        System.out.println("Total Marks: " + sum);
        System.out.println("Average Marks: " + aver);

        s.close();  
    }
}