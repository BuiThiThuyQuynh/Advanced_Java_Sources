package exercise82;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author ThuyQuynh
 * @since 2016-09-16
 * @version 1.0
 * 
 * This is class control connection connect to user table in database.
 */
public class UserController {

	ConnectionDB connDB = new ConnectionDB();
	
	/**
	 * This method is used to check login of a user
	 * @param username This is username of user
	 * @param password This is password of user.
	 * @return boolean User is validate or not.
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
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
	
	/**
	 * This methods is used to check username exist or not.
	 * @param username This is username checked.
	 * @return boolean This is result of username exist or not.
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
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
	
	/**
	 * This method is used to add a user to user table.
	 * @param username This is username of new user.
	 * @param password This is password of new user.
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
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
