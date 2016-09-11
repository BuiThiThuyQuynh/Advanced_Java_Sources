package exercise128;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

/**
 * <h1>Account transaction</h1>
 * The MainAccountTransaction program implements an application that
 * notify to all of observers when state of account was changed
 *  and prints the output on the screen.
 *
 * @author  Bui Thi Thuy Quynh
 * @version 1.0
 * @since   2016-09-10
 */
public class MainAccountTransaction {

	public static void main(String[] args) {
		
		// Initialization account and add notification method for account
		Account account = new Account();
		account.attach(new EmailObserver(account));
		account.attach(new MobileObserver(account));
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			// Enter the amount to be transferred and check validate
			System.out.println("Enter the amount to be transferred (VND): ");
			double amountTransfer = Double.parseDouble(input.readLine());
			
			DecimalFormat df = new DecimalFormat("#,###");
			while (amountTransfer <= 0 || amountTransfer > account.getState()) {
				System.out.println("The amount to be transferred "
						+ "is not validate. It must be less than " 
						+ df.format(account.getState()) + " and greater than 0");
				System.out.println("Enter the amount to be transferred (VND): ");
				amountTransfer = Double.parseDouble(input.readLine());
				
			}
			
			// Set state of account. All of notification method was called.
			account.setState(account.getState() - amountTransfer);
		}
		catch (IOException | NumberFormatException ex) {
			System.out.println("Exception: " + ex);
		}
	}
}
