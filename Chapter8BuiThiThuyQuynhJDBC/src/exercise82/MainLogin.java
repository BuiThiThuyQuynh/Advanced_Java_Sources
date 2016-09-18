package exercise82;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

public class MainLogin {

	public static void main(String[] args) {
		BufferedReader input = new 
				BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("====== LOGIN FORM ===========");
			System.out.println("Enter username: ");
			String username = input.readLine();
			
			System.out.println("Enter password: ");
			String password = input.readLine();
			
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
