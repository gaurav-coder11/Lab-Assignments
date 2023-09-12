import MCA.Student;
import java.util.Scanner;

// Main class to gather student information and display results
public class StudInfo {
    public static void main(String args[]) {
        // Initialize variables to store user input
        String name;
        int roll_no;
        String sclass;
        int mar, eng, math, sci, his, sos;

        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Gather student information from user
        System.out.print("Enter Your Name: ");
        name = sc.nextLine();

        System.out.print("Enter Your Roll Number: ");
        roll_no = sc.nextInt();

        // Clear the newline from the buffer
        sc.nextLine();

        System.out.print("Enter Your Class: ");
        sclass = sc.nextLine();

        System.out.print("Enter Your Marathi Marks Out Of 100: ");
        mar = sc.nextInt();

        System.out.print("Enter Your English Marks Out Of 100: ");
        eng = sc.nextInt();

        System.out.print("Enter Your Math Marks Out Of 100: ");
        math = sc.nextInt();

        System.out.print("Enter Your Science Marks Out Of 100: ");
        sci = sc.nextInt();

        System.out.print("Enter Your History Marks Out Of 100: ");
        his = sc.nextInt();

        System.out.print("Enter Your Social Science Marks Out Of 100: ");
        sos = sc.nextInt();

        // Create a Student object with the gathered information
        Student student = new Student(name, roll_no, sclass, mar, eng, math, sci, his, sos);

        // Display student details
        System.out.println("Student Details:");
        student.display();

        // Calculate and display total marks and percentage
        int totalMarks = student.getTotalMarks();
        double percentage = student.getPercentage();
        System.out.println("--------------Total Marks--------------");
        System.out.println("Total Marks: " + totalMarks + " Out of 600.");
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("----------------------------------------");
    }
}
