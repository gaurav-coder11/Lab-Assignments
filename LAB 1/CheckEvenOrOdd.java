/*
 Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
*/
import java.util.Scanner; // Importing the Scanner class to read user input

public class CheckEvenOrOdd { // Declaring a class named SetEvenOrOdd
    public static void main(String args[]) {
        int num, sum_even = 0, sum_odd = 0; // Declaring variables to store input and sum of even/odd numbers
        char ans; // Declaring a variable to store user's response for continuing the loop

        Scanner sc = new Scanner(System.in); // Creating a Scanner object to read user input

        do {
            System.out.print("Enter a number: "); // Prompting the user to enter a number
            num = sc.nextInt(); // Reading the input number

            if (num % 2 == 0) { // Checking if the number is even (remainder when divided by 2 is 0)
                sum_even = sum_even + num; // Adding the even number to the sum_even variable
            } else {
                sum_odd = sum_odd + num; // Adding the odd number to the sum_odd variable
            }

            System.out.print("Do you want to continue? (y/n): "); // Asking the user if they want to continue
            ans = sc.next().charAt(0); // Reading the user's response (only the first character)

        } while (ans == 'y' || ans == 'Y'); // Continuing the loop if the user enters 'y' or 'Y'

        // Printing the sums of even and odd numbers
        System.out.println("Sum of even numbers is: " + sum_even);
        System.out.println("Sum of odd numbers is: " + sum_odd);
    }
}
