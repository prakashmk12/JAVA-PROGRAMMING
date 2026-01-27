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
class Student {
    String name;
    int age;
    String rollno;
    String course;
    Student(String name, int age, String rollno, String course) {
        this.name = name; 
        this.age = age;
        this.rollno = rollno;
        this.course = course;
    } 
    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll Number: " + rollno);
        System.out.println("Course: " + course);
    }
}
public class EXNO06 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine();  
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Student " + (i + 1) + ":");
            System.out.print("Enter Student Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter Student Age: ");
            int age = scanner.nextInt();
            scanner.nextLine();  
            System.out.print("Enter Student Roll Number: ");
            String rollno = scanner.nextLine();
            System.out.print("Enter Student Course: ");
            String course = scanner.nextLine();
            students[i] = new Student(name, age, rollno, course);
        }
        System.out.println("\nStudent Details:");
        for (int i = 0; i < n; i++) {
            System.out.println("\nDetails of Student " + (i + 1) + ":");
            students[i].displayDetails();
        }
        scanner.close();
    }
}