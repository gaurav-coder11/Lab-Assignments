/*WAP to check whether the person is eligible for getting loan or not.
Condition to grant loan is he should have salary more than 50000 
and He should be citizen of INDIA.Otherwise Loan can't be given to customer
*/

import java.util.Scanner;

public class LoanEligibilityChecker {

    public static void main(String args[]) {
        // Declare variables to store salary and citizenship status
        double salary;
        boolean isIndianCitizen;
        
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the person's salary
        System.out.print("Enter the person's salary: ");
        salary = scanner.nextDouble();

        // Prompt the user to enter whether the person is an Indian citizen or not
        System.out.print("Is the person a citizen of INDIA? (true/false): ");
        isIndianCitizen = scanner.nextBoolean();

        // Check if the person is eligible for a loan based on salary and citizenship status
        if (salary > 50000 && isIndianCitizen) {
            System.out.println("Congratulations! The person is eligible for a loan.");
        } else {
            System.out.println("Sorry, the person is not eligible for a loan.");
        }

        // Close the scanner to release the resources
        scanner.close();
    }
}
