public class CompareThreeNumbers { // Class to compare three numbers

    public static void main(String args[]) { // Main method declaration

        double num1 = 33, num2 = 88, num3 = 55; // Declare and initialize three numbers

        if (num1 >= num2) { // Compare 1st number to 2nd number
            if (num1 >= num3) // Compare 1st number to 3rd number
                System.out.println(num1 + " is the largest number."); // Print the largest number
            else
                System.out.println(num3 + " is the largest number."); // Print the largest number
        } else {
            if (num2 >= num3) // Compare 2nd number to 3rd number
                System.out.println(num2 + " is the largest number."); // Print the largest number
            else
                System.out.println(num3 + " is the largest number."); // Because of the else block, the 3rd number is already greater, print largest number
        }
    }
}
