/*
 * WAP to implement multithreading for Reversing user input as integer number and reverse that
 * number in one thread and create another thread to check whether that number is palindrome or not
 * 
 * apply proper methods
 */

package ThreadDemo;
import java.util.Scanner;

// Custom thread class to reverse a number
class ReverseThread extends Thread {
    private int number;
    private int reversedNumber = 0;    // Reverse the number

    public ReverseThread(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        int originalNumber = number;
        while (number != 0) {
        	// Get the last digit
            int digit = number % 10;	
            //  reversed the number
            reversedNumber = reversedNumber * 10 + digit;
            // Remove the last digit
            number = number / 10;
        }
        System.out.println("Reversed Number: " + reversedNumber);
    }

    public int getReversedNumber() {
        return reversedNumber;
    }
}

// Custom thread class to check if a number is palindrome
class PalindromeThread extends Thread {
    private int number;

    public PalindromeThread(int number) {
        this.number = number;
    }

    @Override
    public void run() {
    	// Create a ReverseThread object 
        ReverseThread reverseThread = new ReverseThread(number);
        // Start the reverse thread
        reverseThread.start();

        try {
        	// Wait for the reverse thread to complete
            reverseThread.join(); 
        } catch (InterruptedException e) {
        	// TODO Auto-generated catch block
            e.printStackTrace();
        }
        //Get the reversed number from the ReverseThread
        int reversedNumber = reverseThread.getReversedNumber();
        //Check if the original number is equal to the reversed number
        if (number == reversedNumber) {
            System.out.println("The number is a palindrome.");
        } else {
            System.out.println("The number is not a palindrome.");
        }
    }
}

public class Palindrome_Number {
    public static void main(String[] args) {
    	//create scanner object
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        //get the number from user
        int userInput = sc.nextInt();
        //close the scanner
        sc.close();
        //create the PalindromeThread class object 
        PalindromeThread pt = new PalindromeThread(userInput);
        //start the thread
        pt.start();
    }
}

