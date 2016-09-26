package jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.List;
import java.util.regex.Pattern;

/**
 * @author ThuyQuynh
 * @since 2016-09-19
 * @version 1.0
 * 
 * This is an application for management a CD store included
 * 	view all of CDs in store, add new CD to store,
 * 	update a CD, delete a CD and search CD in store.
 */
public class MainCDManagement {
	
	static CDController cdController;
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

	/**
	 * This method is used to show menu on the screen for user choosing.
	 * @param No.
	 * @return Nothing.
	 */
	public static void showMenu() {
		System.out.println("======== MENU ============");
		System.out.println("1. View all CD in store.");
		System.out.println("2. Add new CD to store.");
		System.out.println("3. Update a CD in store.");
		System.out.println("4. Delete a CD from store.");
		System.out.println("5. Search a CD by name or singer.");
		System.out.println("6. Exit.");
	}
	
	/**
	 * This method is used to show all of CDs in store.
	 * @param No.
	 * @return Nothing.
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public static void viewAllCD(List<CD> cds) throws ClassNotFoundException, SQLException {
		System.out.println("========= LIST CDs =============");
	//	System.out.println("ID\tName\t\tSinger\tNumber songs\tPrice");
		int size = cds.size();
		for (int i = 0; i < size; i++) {
			System.out.println("--------- CD " + (i + 1) + " ---------");
			System.out.println(cds.get(i).toString());
		}
	}
	
	/**
	 * This method is used to add new CD to store.
	 * @param No.
	 * @return Nothing.
	 * @throws IOException 
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public static void addCD() throws IOException, ClassNotFoundException, SQLException {
		/**
		 * Enter the information of new CD
		 */
		System.out.println("=========== ADD NEW CD ===============");
		System.out.println("Enter name: ");
		String name = input.readLine();
		
		System.out.println("Enter singer: ");
		String singer = input.readLine();
		
		System.out.println("Enter number songs: ");
		int numberSongs = Integer.parseInt(input.readLine());
		
		while (numberSongs < 0) {
			System.out.println("Number songs must be greater than or equal to 0");
			System.out.println("Enter number songs: ");
			numberSongs = Integer.parseInt(input.readLine());
		}
		
		System.out.println("Enter price: ");
		double price = Double.parseDouble(input.readLine());
		
		while (price < 0) {
			System.out.println("Price must be greater than or equal to 0");
			System.out.println("Enter price: ");
			price = Double.parseDouble(input.readLine());
		}
		
		// Add CD to store.
		CD cd = new CD(name, singer, numberSongs, price);
		cdController.addCD(cd);
		System.out.println("CD was saved.");
	}
	
	/**
	 * This methods is used to update the information of CD in store.
	 * @param No.
	 * @return Nothing.
	 * @throws IOException 
	 * @throws NumberFormatException 
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public static void updateCD() throws NumberFormatException, 
				IOException, ClassNotFoundException, SQLException {
		/**
		 * Enter the information of CD which want to update.
		 */
		System.out.println("========== UPDATE CD =========");
		System.out.println("Enter id of CD want to update: ");
		int id = Integer.parseInt(input.readLine());
		
		List<CD> cds = cdController.getAllCDs();
		while (id <= 0 || id > cds.size()) {
			System.out.println("ID " + id + " invalidate. Choose again: ");
			id = Integer.parseInt(input.readLine());
		}
		
		System.out.println("Enter new number songs: ");
		int numberSongs = Integer.parseInt(input.readLine());
		
		while (numberSongs <= 0) {
			System.out.println("Number songs invalidate. Enter again: ");
			numberSongs = Integer.parseInt(input.readLine());
		}
		
		System.out.println("Enter new price: ");
		double price = Double.parseDouble(input.readLine());
		
		while (price <= 0) {
			System.out.println("Price invalidate. Enter again: ");
			price = Double.parseDouble(input.readLine());
		}
		
		// Update the information of CD.
		CD cd = new CD(id, numberSongs, price);
		cdController.updateCD(cd);
		System.out.println("CD was updated.");
	}
	
	/**
	 * This method is used to remove a CD from store.
	 * @param No.
	 * @return Nothing.
	 * @throws IOException 
	 * @throws NumberFormatException 
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public static void deleteCD() throws NumberFormatException,
				IOException, ClassNotFoundException, SQLException {
		System.out.println("========= REMOVE CD ===========");
		System.out.println("Enter id of CD want to remove: ");
		int id = Integer.parseInt(input.readLine());
		
		List<CD> cds = cdController.getAllCDs();
		while (id <= 0 || id > cds.size()) {
			System.out.println("ID " + id + " invalidate. Choose again: ");
			id = Integer.parseInt(input.readLine());
		}
		
		// Remove CD from store.
		cdController.deleteCD(id);
		System.out.println("CD was removed.");
	}
	
	/**
	 * This method is used to search CD by name or singer.
	 * @param No.
	 * @return Nothing.
	 * @throws IOException 
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public static void searchCD() throws IOException, 
				ClassNotFoundException, SQLException {
		System.out.println("======= SEARCH CD BY NAME OR SINGER NAME ===============");
		System.out.println("Enter key word: ");
		String keyWord = input.readLine();
		
		List<CD> cds = cdController.searchCD(keyWord);
		System.out.println("SEARCH RESULTS: ");
		if (cds.size() == 0)
			System.out.println("'" + keyWord + "' was not found");
		else
			viewAllCD(cds);
	}
	
	public static void main(String[] args) {
		
		// Pattern for choose menu have 6 option.
		Pattern pattern = Pattern.compile("[123456]");
		
		cdController = new CDController();
		try {
			boolean again = true;
			while (again) {
				// Show menu on the screen and user choose an option.
				showMenu();
				String choice = input.readLine();
				
				// Check validate of option.
				while (!pattern.matcher(choice).matches()) {
					System.out.println("Choice is invalidate. Choose again: ");
					choice = input.readLine();
				}
				
				// Display user's choice
				switch (choice) {
				case "1":
					viewAllCD(cdController.getAllCDs());
					break;
				case "2":
					addCD();
					break;
				case "3":
					updateCD();
					break;
				case "4":
					deleteCD();
					break;
				case "5":
					searchCD();
					break;
				case "6":
					again = false;
					System.out.println("Application ended");
					break;
				default:
					break;
				}
				
			}
			
		}
		catch (IOException | ClassNotFoundException | SQLException e) {
			System.out.println("Error: " + e);
		}

	}

}
