package jdbc02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTest4 {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "makarand", "makarand");
			
			
			int studentId = 107;
			String studentName = "Test7";
			double studentScore = 70;
			
			String query = "Insert Into Students(Student_Id, Student_Name, Student_Score) values (?, ?, ?)";
			PreparedStatement pstatement = connection.prepareStatement(query);
			pstatement.setInt(1, studentId);
			pstatement.setString(2, studentName);
			pstatement.setDouble(3, studentScore);
			
			pstatement.executeUpdate();
			
			System.out.println("Record inserted to database.");
			
			pstatement.close();
			connection.close();
		} 
		catch (ClassNotFoundException e) {
			System.out.println("Driver class not found.");
		}
		catch(SQLException e) {
			e.printStackTrace();
			System.out.println("SqlException");
		}
	}
}

// Statement - Select
// PrepareStatement - Insert, Update, Delete
// CallableStatement - To call any stored procedure from the database
