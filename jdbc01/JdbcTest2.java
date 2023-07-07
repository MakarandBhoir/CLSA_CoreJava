package jdbc01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTest2 {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // Step1 - Loading Driver
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "makarand", "makarand"); // Step 2 - Getting connection
			Statement stmt = connection.createStatement(); // Step 3 - Get the statement for execute sql commands
			String sql = "Select * From Students";
			ResultSet rs = stmt.executeQuery(sql); // Step 4 - executing the query
			
			while( rs.next() ) {
				int id = rs.getInt("Student_Id");
				String name = rs.getString("Student_Name");
				double score = rs.getDouble("Student_Score");
				
				System.out.println(id+", "+name+", "+score);
			}
			stmt.close();
			connection.close();
		}
		catch(ClassNotFoundException e) {
			System.out.println("Driver class not found.");
		}
		catch(SQLException e) {
			System.out.println("Sql Exception");
		}
	}
}
