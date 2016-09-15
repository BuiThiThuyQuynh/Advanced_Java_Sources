package exercise27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

import exercise27.Contacts;

/**
 * <h1>Manage contacts</h1>
 * The MainManagementContacts program implements an application that
 * 	manages contacts (add, update, delete and search contact).
 *
 * @author  Bui Thi Thuy Quynh
 * @version 1.0
 * @since   2016-09-11
 */
public class MainManagementContacts {
	
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	static Contacts contacts;
	
	/**
	 * This method is used to show menu for user.
	 * @param No.
	 * @return Nothing.
	 */
	public static void showMenu() 
			throws NumberFormatException, IOException {
		// Show menu
		System.out.println("======== MENU ==========");
		System.out.println("1. View contacts");
		System.out.println("2. Add contact");
		System.out.println("3. Search contact by name");
		System.out.println("4. Remove contact by name or phone number");
		System.out.println("5. Update contact");
		System.out.println("6. Exit");
		
		// Check validate of choice 
		int choose = Integer.parseInt(input.readLine());
		while (choose <= 0 || choose > 6) {
			System.out.println("Please choose from 1 to 6");
			System.out.println("======== MENU ==========");
			System.out.println("1. View contacts");
			System.out.println("2. Add contact");
			System.out.println("3. Search contact by name");
			System.out.println("4. Remove contact by name or phone number");
			System.out.println("5. Update contact");
			System.out.println("6. Exit");
			choose = Integer.parseInt(input.readLine());
		}
		
		// Check choosing of user and show information for corresponding action 
		switch (choose) {
		case 1:
			viewContacts();
			break;
		case 2:
			addContact();
			break;
		case 3:
			searchContact();
			break;
		case 4:
			removeContact();
			break;
		case 5:
			updateContact();
			break;
		case 6:
		default:
			System.out.println("Application ended");
			break;
		}
	}

	/**
	 * This method is used to show contacts.
	 * @param No.
	 * @return Nothing.
	 */
	public static void viewContacts() throws NumberFormatException, IOException {
		// Check list contact not null --> show list contact
		// Else application ask user want to add new contact or not. 
		// 		If user choose yes, application will allow user add new contact to list
		if (contacts.getContacts().size() != 0)
			System.out.println(contacts.toString());
		else {
			System.out.println("List contact do not have any contact");
			System.out.println("Do you add new contact to list?");
			System.out.println("1. Yes");
			System.out.println("2. No");
			
			int choose = Integer.parseInt(input.readLine());
			while (choose <= 0 || choose > 2) {
				System.out.println("Please choose 1 or 2");
				System.out.println("Do you add new contact to list?");
				System.out.println("1. Yes");
				System.out.println("2. No");
				choose = Integer.parseInt(input.readLine());
			}
			
			switch (choose) {
			case 1:
				addContact();
				break;
			case 2:
			default:
				break;
			}
		}
		
		showMenu();
	}
	
	/**
	 * This method is used to add new contact.
	 * @param No.
	 * @return Nothing.
	 */
	public static void addContact() throws IOException {
		boolean again = true;
		
		// Enter the information for new contact, check validate and allow user continue entering if user want
		while (again) {
			System.out.println("Enter name: ");
			String name = input.readLine();
			
			while (contacts.checkContact(name)) {
				System.out.println(name + " have already existing.");
				System.out.println("Enter name: ");
				name = input.readLine();
			}
			
			System.out.println("Enter phone number: ");
			String phoneNumber = input.readLine();
			
			// Add contact to contacts and show contacts
			contacts.addContact(name, phoneNumber);
			viewContacts();
			
			// Ask user want to continue adding contact or not
			System.out.println("Do you continue add new contact?");
			System.out.println("1. Yes");
			System.out.println("2. No");
			
			int choose = Integer.parseInt(input.readLine());
			while (choose <= 0 || choose > 2) {
				System.out.println("Please choose 1 or 2");
				System.out.println("Do you continue add new contact?");
				System.out.println("1. Yes");
				System.out.println("2. No");
				choose = Integer.parseInt(input.readLine());
			}
			
			switch (choose) {
			case 1:
				continue;
			case 2:
			default:
				again = false;
				break;
			}
		}
	}

	/**
	 * This method is used to search contact by name (relation search).
	 * @param No.
	 * @return Nothing.
	 */
	public static void searchContact() throws IOException {
		// Check contacts is null --> allow user add new contact to contacts.
		// Else application require user enter key word for searching and show result. 
		if (contacts.getContacts().size() == 0)
			viewContacts();
		else {
			System.out.println("Enter name of contact want to search: ");
			String name = input.readLine();
			
			Map<String, String> contactFound = contacts.searchContactRelation(name);
			
			System.out.println("Search result: ");
			if (contactFound == null)
				System.out.println(name + " was not found");
			else {
				System.out.println("Name\tPhone number");
				for (String key : contactFound.keySet()) {
					System.out.println(key + "\t" + contactFound.get(key));
				}
			}

			showMenu();
		}
	}

	/**
	 * This method is used to delete contact by name or phone number.
	 * @param No.
	 * @return Nothing.
	 */
	public static void removeContact() throws IOException {
		// Check contact is null --> allow user add new contact to contacts
		// Else application require user enter key word for deleting and show result. 
		if (contacts.getContacts().size() == 0)
			viewContacts();
		else {
			System.out.println("Enter name or phone number of contact want to remove: ");
			String s = input.readLine();
			
			System.out.println("Remove result:");
			System.out.println(contacts.deleteContact(s));
			viewContacts();
		}
		
	}
	
	/**
	 * This method is used to update contact by name.
	 * @param No.
	 * @return Nothing.
	 */
	public static void updateContact() throws IOException {
		// Check contacts is null --> allow user add new contact to contacts
		// Else application require user enter key word for deleting and show result. 
		if (contacts.getContacts().size() == 0)
			viewContacts();
		else {
			System.out.println("Enter name of contact want to update: ");
			String name = input.readLine();
			
			while (!contacts.checkContact(name)) {
				System.out.println(name + " have already existing.");
				System.out.println("Enter name: ");
				name = input.readLine();
			}
			
			System.out.println("Enter new phone number: ");
			String phoneNumber = input.readLine();
			
			System.out.println("Update result:");
			System.out.println(contacts.updateContact(name, phoneNumber));
			viewContacts();
		}
	}

	/**
	 * This is the main method which is used to manage contacts
	 * 	included add, update, delete and search contact.
	 * @param args Unused.
	 * @return Nothing.
	 * @exception IOException On input error.
	 * @exception NumberFormatException On number format error.
	 * @see IOException.
	 * @see NumberFormatException.
	 */
	public static void main(String[] args) {
		
		contacts = new Contacts();
		try {
			// Show menu for user choose and handles this choice.
			showMenu();
		}
		catch (IOException | NumberFormatException ex) {
			System.out.println("Exception: " + ex);
		}
	}

}
