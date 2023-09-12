//WAP to search given student name is available in the list of student name using String array.
import java.util.Scanner;

public class SearchStudentName {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        // List of names to search
        String[] names = { "Arjun", "Aarav", "Rohan", "Siddharth", "Aditya" };
        
        System.out.print("Enter student name to search: ");
        String searchName = sc.nextLine();
        
        boolean isAvailable = false;
        
        // Iterate through the list to search for the name
        for (int i = 0; i < names.length; i++) {
            if (searchName.equals(names[i])) {
                isAvailable = true; // Name is found
                break; // No need to search further
            }
        }
        
        // Display the result based on availability
        if (isAvailable) {
            System.out.println(searchName + " is available in the list.");
        } else {
            System.out.println(searchName + " is not available in the list.");
        }
        
        sc.close(); // Close the scanner
    }
}
