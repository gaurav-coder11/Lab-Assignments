/*
Create package MyArray to accept 10 values from user
 import created package to find particular element from the array using binary search algorithm in java
 ArrayHandler
*/
// create packages
package MyArray;
// import scanner class for give value from value
import java.util.Scanner;

public class ArrayHandler {
	//create method for accept the value from user and stoore in array
    public int[] getArrayInput() {
    	//declare array
        int arr[] = new int[10];
        Scanner sc = new Scanner(System.in);
        //accept input from user and store to array
        for (int i = 0; i < 10; i++) {
        	System.out.println("Enter 10 Number:");
            System.out.print("Enter a Number: ");
            int input = sc.nextInt();
            arr[i] = input;
        }

        return arr;
    }
}
