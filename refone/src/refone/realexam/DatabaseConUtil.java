package refone.realexam;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConUtil {
	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver")
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "id", "pwd")
		}catch ()
}
