/*
 * 
Q.1 You need to create a table named employees in the database to store employee information. 
Write a Java program using JDBC to create the employees table with the following columns:

id of type INT, which is the primary key and auto-incremented.
first_name of type VARCHAR(50) to store the employee's first name.
last_name of type VARCHAR(50) to store the employee's last name.
age of type INT to store the employee's age.
 
 */

package jdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		// Load the MySQL JDBC driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
		// Establish a connection to the MySQL database
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/meradb","root","root");
		// Create a statement object for executing SQL queries
		Statement stmt = con.createStatement();
		// Execute an SQL query to create a table named "Employee"
		int a = stmt.executeUpdate("CREATE TABLE Employee(ID int primary key not null AUTO_INCREMENT, First_Name varchar(50) NOT NULL, Last_NAme varchar(50), Age int)");
		// Print a success message if the table creation is successful
		System.out.println("Table Creation SuccessFully..");
		// Close the database connection
		con.close();
	}

}
