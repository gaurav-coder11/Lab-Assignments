//Check whether the user input number is prime number or not

import java.util.*;

public class PrimeOrNot {    
    public static void main(String args[]) {
        int i, num1, num2 = 0, flag = 0; // Declare variables
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number:");
        num1 = sc.nextInt(); // Input the number to be checked
        
        num2 = num1 / 2; // Calculate half of the input number
        
        if (num1 == 0 || num1 == 1) {  
            System.out.println(num1 + " is not a prime number"); // Special cases: 0 and 1 are not prime
        } else {  
            for (i = 2; i <= num2; i++) {
                if (num1 % i == 0) {  
                    System.out.println(num1 + " is not a prime number");  
                    flag = 1;  
                    break;  
                }  
            }
            
            if (flag == 0) { 
                System.out.println(num1 + " is a prime number"); // If no divisors found, the number is prime
            }  
        } // End of else  
    }    
}

