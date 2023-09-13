package jdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Show_Employee_Table {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		//step2
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/meradb","root","root");  
		//step 3
		Statement stmt = con.createStatement();
		//step 4
		ResultSet rs = stmt.executeQuery("select * from Employee");
		int id, age;
		String lname,fname;
		System.out.println("=================================");
		System.out.println("         Employee Details       ");
		System.out.println("=================================");
		
		while(rs.next())
		{
		id = rs.getInt(1);
		fname = rs.getString(2);
		lname = rs.getString(3);
		age = rs.getInt(4);
		System.out.println(id+" "+fname+" "+lname+" "+age );
		}
		
		System.out.println("=================================");
		con.close();
	}

}
