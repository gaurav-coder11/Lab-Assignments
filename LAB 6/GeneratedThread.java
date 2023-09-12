package ThreadDemo;
/*
 * Write a JAVA program which will generate the threads:

- To display 10 terms of Fibonacci series.
- To display 1 to 10 in reverse order.
 */
//Custom thread class for generating Fibonacci series
class Fibonacci_series extends Thread {
 int n = 10; // Number of terms to display
 int firstTerm = 0, secondTerm = 1;

 @Override
 public void run() {
     // Generate Fibonacci series
     for (int i = 1; i <= n; i++) {
         System.out.println("Fibonacci Series:" + firstTerm + " ");

         int nextTerm = firstTerm + secondTerm;
         firstTerm = secondTerm;
         secondTerm = nextTerm;
     }
 }
}

//Custom thread class for generating numbers in reverse order
class Reverse_order extends Thread {
 @Override
 public void run() {
     // Generate numbers in reverse order
     for (int i = 10; i >= 1; i--) {
         System.out.println("Numbers in Reverse Order:" + i + " ");
     }
 }
}

public class GeneratedThread {
 public static void main(String[] args) {
     // Create instances of custom thread classes
     Fibonacci_series fs = new Fibonacci_series();
     Reverse_order ro = new Reverse_order();

     // Start the threads
     fs.start();
     ro.start();
 }
}
