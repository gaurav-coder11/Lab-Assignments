//WAP to swap two numbers without using third variable

import java.util.Scanner;

class NumberSwapper {
    private int num1;
    private int num2;

    // Constructor to initialize num1 and num2
    public NumberSwapper(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // Method to swap the numbers
    public void swapNumbers() {
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
    }

    // Method to display the swapped numbers
    public void displaySwappedNumbers() {
        System.out.println("After swapping:");
        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);
    }
}

public class NumberSwapWithoutThirdVeriable {
    public static void main(String[] args) {
    	int num1,num2;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        num2 = scanner.nextInt();

        // Create an instance of NumberSwapper
        NumberSwapper swapper = new NumberSwapper(num1, num2);

        System.out.println("Before swapping:");
        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);

        // Swap the numbers using the class method
        swapper.swapNumbers();

        // Display the swapped numbers using the class method
        swapper.displaySwappedNumbers();

        scanner.close();
    }
}
