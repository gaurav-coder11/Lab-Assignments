//WAP to given number is Armstrong
import java.util.Scanner;

class Armstrong {
    //Declare the veriables
    int originalNum, digit, cubeSum = 0, num;
    Scanner sc = new Scanner(System.in);

    //Create class method 
    public void findArmstrong() {
        System.out.print("Enter the number:");
        num = sc.nextInt();
        originalNum = num;

        // Calculate the cube sum of digits
        while (num > 0) {
            digit = num % 10;
            cubeSum = cubeSum + digit * digit * digit;
            num = num / 10;
        }

        // Check if the cube sum is equal to the original number
        if (cubeSum == originalNum) {
            System.out.println(originalNum + " is an Armstrong number");
        } else {
            System.out.println(originalNum + " is not an Armstrong number");
        }
    }
}

//Create new class 
public class ArmstrongNumber {

    public static void main(String args[]) {
        // Create an instance of the Armstrong class
        Armstrong armstrong = new Armstrong();
        // Call the findArmstrong method to check if the number is Armstrong
        armstrong.findArmstrong();
    }
}
