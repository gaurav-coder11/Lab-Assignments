//Write a java program to capitalize each word in string.
import java.util.Scanner;

public class CapitalizeWord {

    public static void main(String[] args) {
        String str, capWord; // Declare variables to store the input and capitalized string
        Scanner sc = new Scanner(System.in); // Create a Scanner object to read user input
        
        System.out.print("Enter a string: ");
        str = sc.nextLine(); // Read the input string from the user
        
        System.out.println("Before capitalizing: " + str);
        
        capWord = str.toUpperCase(); // Convert the entire input string to uppercase
        
        System.out.println("After capitalizing: " + capWord);
        
        sc.close(); // Close the scanner to release resources
    }
}
