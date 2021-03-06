package exercise83;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

import exercise82.UserController;

/**
 * @author ThuyQuynh
 * @since 2016-09-16
 * @version 1.0
 * 
 * This is class add new user .
 */
public class MainAddUser {

	public static void main(String[] args) {
		BufferedReader input = new 
				BufferedReader(new InputStreamReader(System.in));
		UserController userController = new UserController();
		try {
			// User enter the information of new user.
			System.out.println("====== ADD USER ===========");
			System.out.println("Enter username: ");
			String username = input.readLine();
			
			while (userController.checkUsername(username)) {
				System.out.println(username + " have aldready exists.");
				System.out.println("Enter username: ");
				username = input.readLine();
			}
			
			System.out.println("Enter password: ");
			String password = input.readLine();
			
			while ("".equals(password.trim())) {
				System.out.println("Password not null");
				System.out.println("Enter password: ");
				password = input.readLine();
			}
			
			System.out.println("Confirm password: ");
			String confirmPass = input.readLine();
			
			while (!confirmPass.equals(password)) {
				System.out.println("Password not match");
				
				System.out.println("Enter password: ");
				password = input.readLine();
				
				while ("".equals(password.trim())) {
					System.out.println("Password not null");
					System.out.println("Enter password: ");
					password = input.readLine();
				}
				
				System.out.println("Confirm password: ");
				confirmPass = input.readLine();
			}
			
			// Insert new user to table and inform result.
			userController.addAccount(username, password);
			System.out.println("New account is created. Now you can use it to login");
			
		}
		catch (IOException | ClassNotFoundException | SQLException e) {
			System.out.println("Error: " + e);
		}
	}
}
