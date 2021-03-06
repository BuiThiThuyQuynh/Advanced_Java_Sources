package exercise87;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author ThuyQuynh
 * @since 2016-09-17
 * @version 1.0
 * 
 * This is class connect to database in MySQL.
 */
public class ConnectionDB {

//	private static final String JDBC_URL = 
//			"jdbc:mysql://localhost:3306/mystore?"
//			+ "useUnicode=true&characterEncoding=utf8";
	
	private static final String JDBC_URL = 
			"jdbc:mysql://127.0.0.1/store?"
			+ "useUnicode=true&characterEncoding=utf8";
	
	private static final String JDBC_DRIVER_CLASS = 
			"com.mysql.cj.jdbc.Driver";
	private static final String JDBC_USERNAME = "root";
	private static final String JDBC_PASSWORD = "123";
	
	public Connection connect() throws SQLException, ClassNotFoundException {
		Class.forName(JDBC_DRIVER_CLASS);
		Connection conn = DriverManager.getConnection(JDBC_URL,
				JDBC_USERNAME, JDBC_PASSWORD);
		
		return conn;
	}
	
}
