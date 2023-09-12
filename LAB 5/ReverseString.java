//WAP a program to reverse a given String without using reverse() method.

import java.util.Scanner;

public class ReverseString {
    public static void main(String args[]) {
        String string;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a String: ");
        string = sc.nextLine(); // Read the input string from the user
        
        System.out.println("Before reverse, string is: " + string);
        System.out.print("After reverse, string is: ");
        
        for (int i = string.length(); i > 0; i--) {
            // Print the character at index (i-1) to reverse the string
            System.out.print(string.charAt(i - 1));
        }
        
        sc.close(); // Close the scanner
    }
}
 