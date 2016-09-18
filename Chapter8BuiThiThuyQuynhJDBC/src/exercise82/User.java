package exercise82;

/**
 * @author ThuyQuynh
 * @since 2016-09-16
 * @version 1.0
 * 
 * This is class manages the information of a user
 * 	as user table in database.
 */
public class User {

	private int id;
	private String username;
	private String password;
	
	public User() {
		
	}

	public User(int id, String username, String password) {
		this.id = id;
		this.username = username;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
