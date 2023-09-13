/*
 * Q.2 The employees table in the database has the following columns: id, first_name, last_name, and age. Write a Java program using JDBC to insert a new employee record into the table. 
 * The employee's first name is "John," last name is "Doe," and age is 30.
 */
package jdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Employee_Insert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Load the MySQL JDBC driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
		// Establish a connection to the MySQL database
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/meradb","root","root");  
		// Create a PreparedStatement for inserting data into the "Employee" table
		// The "?" placeholders will be filled with values later
		PreparedStatement pst= con.prepareStatement("INSERT INTO Employee VALUES(?,?,?,?)");
		// Create a Scanner object to take user input
		Scanner sc = new Scanner(System.in);
		// Prompt the user to enter employee information
		System.out.print("Enter Employee Id: ");
		int id = sc.nextInt();
		
		System.out.print("Enter Employee First Name: ");
		String fname = sc.next();
				
		System.out.print("Enter Employee Last Name: ");
		String lname = sc.next();
		
		System.out.print("Enter Employee Age: ");
		int age = sc.nextInt();
		// Set the values for the placeholders in the PreparedStatement
		pst.setInt(1, id);
		pst.setString(2, fname);
		pst.setString(3, lname);
		pst.setInt(4, age);
		// Execute the INSERT query to add a new record to the "Employee" table
		int r = pst.executeUpdate();
		// Close the database connection
		con.close();
		// Print a message indicating the number of records added
		System.out.println(r + " Record Added SuccessFully..");
	}

}
