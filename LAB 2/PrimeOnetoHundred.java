//WAP to generate prime numbers between 1 and 100

class PrimeOnetoHundred {
    public static void main(String arg[]) {
        int i, j, num = 100, count; // Declare variables
        
        System.out.println("Prime numbers between 1 to " + num + " are ");
        
        // Loop through numbers from 2 to num
        for (i = 2; i <= num; i++) {
            count = 0; // Initialize count for each number
            
            // Check divisibility from 1 to i
            for (j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++; // Increment count if divisible
                }
            }
            
            // If count is 2, the number is prime
            if (count == 2) {
                System.out.print(i + "  ");
            }
        }
    }
}
