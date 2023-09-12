import MyArray.ArrayHandler;

import java.util.Scanner;

public class NumberSearchUsingBinarySearch {
    public static void main(String args[]) {
        // Create an instance of ArrayHandler to handle input
        ArrayHandler arrayInput = new ArrayHandler();

        // Get array input from user
        int arr[] = arrayInput.getArrayInput();

        int start = 0;
        int end = arr.length - 1;
        int position = -1; // Initialize position to -1 (not found)
        int find;

        // Sorting the array using bubble sort
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    // Swap elements
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // Display the sorted array
        System.out.println("\n*******************");
        System.out.println("Sorted Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("*******************\n");

        // Input the number to find
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to find: ");
        find = sc.nextInt();

        // Binary search loop
        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == find) {
                position = mid;
                System.out.println("The Element is present at index " + position);
                break;
            } else if (arr[mid] < find) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        // Display result if the element is not found
        if (position == -1) {
            System.out.println("The Element is not present in the array.");
        }
    }
}

