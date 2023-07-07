package jdbc02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTest3 {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "makarand", "makarand");
			Statement statement =  connection.createStatement();
			
			int studentId = 105;
			String studentName = "Test5";
			double studentScore = 30;
			
			String query = "Insert Into Students(Student_Id, Student_Name, Student_Score) values ("+studentId+", '"+studentName+"', "+studentScore+")";
			System.out.println(query);
			
			statement.executeUpdate(query);
			System.out.println("Record inserted...");
			
			statement.close();
			connection.close();
		} 
		catch (ClassNotFoundException e) {
			System.out.println("Driver class not found.");
		}
		catch(SQLException e) {
			System.out.println("SqlException");
		}
	}
}

// Statement - Select
// PrepareStatement - Insert, Update, Delete
// CallableStatement - To call any stored procedure from the database
