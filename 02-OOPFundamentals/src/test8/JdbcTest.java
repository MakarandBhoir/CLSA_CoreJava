package test8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcTest {
	public static void main(String[] args) throws ClassNotFoundException {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // com.mysql.cj.JdbcDriver - mysql-connector.jar

			System.out.println("Driver is loaded.");
			try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "makarand",
					"makarand");) {
				System.out.println("Connection is established sucessfully.");
			} catch (SQLException e) {
				System.out.println("Sql Exception");
			}
		} catch (ClassNotFoundException e) {

		}
	}
}

//jar -> many java classes together
