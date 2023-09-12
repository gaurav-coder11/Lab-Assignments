/*
Create a class Student having rool_ number,Name as fields .Create another class Marksdetails to 
accept 5 subject marks .Apply Single Inheritance to display the result
*/
import java.util.Scanner;

class Student {
    int rollNumber;
    String name;
    // Other fields related to marks and percentage could be added here

    Scanner scanner = new Scanner(System.in);

    // Constructor to initialize roll number and name
    public Student(String name, int rollNumber) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Roll Number: " + rollNumber);
    }
}

class MarksDetails extends Student {
    double english_Marks, math_Marks, physics_Marks, chemestry_Marks, bio_Marks, totalMarks, percentage,marks;

    // Constructor to initialize student details and marks
    public MarksDetails(String name, int rollNumber) {
        super(name, rollNumber);
    }

    // Method to accept subject marks
    public void acceptMarks() {
        System.out.print("Enter Your English Marks Out Of 100: ");
        english_Marks = scanner.nextDouble();
        System.out.print("Enter Your Math Marks Out Of 100: ");
        math_Marks = scanner.nextDouble();
        System.out.print("Enter Your Physics Marks Out Of 100: ");
        physics_Marks = scanner.nextDouble();
        System.out.print("Enter Your Chemestry Marks Out Of 100: ");
        chemestry_Marks = scanner.nextDouble();
        System.out.print("Enter Your Biology Marks Out Of 100: ");
        bio_Marks = scanner.nextDouble();
        System.out.println("\n");
    }

    // Method to calculate and display result
    public void displayResult() {
        totalMarks = english_Marks + math_Marks + physics_Marks + chemestry_Marks + bio_Marks;

        percentage = (totalMarks / 500) * 100;
        marks=percentage;
        
        System.out.println("Your English Marks: " + english_Marks);
        System.out.println("Your Mathematics Marks: " + math_Marks);
        System.out.println("Your Physics Marks: " + physics_Marks);
        System.out.println("Your Chemistry Marks: " + chemestry_Marks);
        System.out.println("Your Biology Marks: " + bio_Marks);
        System.out.println("\n");
        System.out.println("-----------------------------------------------");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("-----------------------------------------------");
        System.out.println("\n");
        System.out.println("-----------------------------------------------");
        System.out.println("Total Percentage: " + percentage + "%");
        System.out.println("-----------------------------------------------");

        // Providing result based on percentage
        if (marks >= 85) {
            System.out.print("Congratulations! You are in the Distinction category, ");
        } else if (marks < 85 && marks >= 60) {
            System.out.print("Congratulations! You are in the First Class category, ");
        } else if (marks < 60 && marks >= 45) {
            System.out.print("Good job! You are in the Second Class category, ");
        } else if (marks < 45 && marks >= 35) {
            System.out.print("You have passed, ");
        } else {
            System.out.print("Unfortunately, you have failed, ");
        }
    }
}

public class StudentMarkshit {
    public static void main(String[] args) {
    	String name;
    	int rollNumber;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        name = scanner.nextLine();

        System.out.print("Enter Your roll number: ");
        rollNumber = scanner.nextInt();

        MarksDetails studentMarks = new MarksDetails(name, rollNumber);

        studentMarks.acceptMarks();
        studentMarks.displayStudentDetails();
        studentMarks.displayResult();

        scanner.close();
    }
}
