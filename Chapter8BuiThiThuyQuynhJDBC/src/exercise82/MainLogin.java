package exercise82;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

/**
 * @author ThuyQuynh
 * @since 2016-09-16
 * @version 1.0
 * 
 * This is class check login of user 
 * 	and print result login on the screen.
 */
public class MainLogin {

	public static void main(String[] args) {
		BufferedReader input = new 
				BufferedReader(new InputStreamReader(System.in));
		
		try {
			// User enter username and password to login.
			System.out.println("====== LOGIN FORM ===========");
			System.out.println("Enter username: ");
			String username = input.readLine();
			
			System.out.println("Enter password: ");
			String password = input.readLine();
			
			// Check user and print result.
			UserController userController = new UserController();
			if(userController.checkLogin(username, password))
				System.out.println("Wellcome to our store");
			else
				System.out.println("Invalid username or password");
		}
		catch (IOException | ClassNotFoundException | SQLException e) {
			System.out.println("Error: " + e);
		}

	}

}
