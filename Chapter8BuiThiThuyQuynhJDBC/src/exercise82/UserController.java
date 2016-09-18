package exercise82;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserController {

	ConnectionDB connDB = new ConnectionDB();
	
	
	public boolean checkLogin(String username, String password) throws ClassNotFoundException, SQLException {
		try (Connection conn = connDB.connect()) {
			Statement statement  = conn.createStatement();
			String sql = "Select username, password from user"
					+ " where username like '" + username + "' and password like '" + password +"';";
			ResultSet results = statement.executeQuery(sql);
			while (results.next()) {
				String usn = results.getString("username");
				String pwd = results.getString("password");
				if (username.equals(usn) && password.equals(pwd)) {
					conn.close();
					return true;
				}
			}
			conn.close();
			return false;
		}
	}
	
	public boolean checkUsername(String username) throws ClassNotFoundException, SQLException {
		try (Connection conn = connDB.connect()) {
			Statement statement  = conn.createStatement();
			String sql = "Select username, password from user"
					+ " where username like '" + username + "';";
			ResultSet results = statement.executeQuery(sql);
			while (results.next()) {
				String usn = results.getString("username");
				if (username.equals(usn)) {
					conn.close();
					return true;
				}
			}
			conn.close();
			return false;
		}
	}
	
	public void addAccount(String username, String password) throws SQLException, ClassNotFoundException {
		try (Connection conn = connDB.connect()) {
			
			String sql = "insert into user(username, password) values (?, ?);";
			PreparedStatement preStatement = conn.prepareStatement(sql);
			preStatement.setString(1, username);
			preStatement.setString(2, password);
			
			preStatement.execute();
			
			conn.close();
		}
	}
	
}
