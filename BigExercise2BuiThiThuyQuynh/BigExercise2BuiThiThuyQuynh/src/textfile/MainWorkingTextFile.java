package textfile;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import jdbc.CD;
import jdbc.CDController;

/**
 * @author ThuyQuynh
 * @since 2016-09-19
 * @version 1.0
 * 
 * This is an application for get all of CDs from cd table in database and 
 * 	write them to text file by CD object, then read list CD objects from text file
 * 	and print on the screen.
 */
public class MainWorkingTextFile {
	
	/**
	 * This method is used to show all of CDs in store.
	 * @param No.
	 * @return Nothing.
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public static void viewAllCD(List<CD> cds) throws ClassNotFoundException, SQLException {
		System.out.println("========= LIST CDs =============");
		int size = cds.size();
		for (int i = 0; i < size; i++) {
			System.out.println("--------- CD " + (i + 1) + " ---------");
			System.out.println(cds.get(i).toString());
		}
	}

	public static void main(String[] args) {
		try {
			String filePath = "src/textfile/cd.txt";
			CDController cdController = new CDController();
			ManagementCDTextFile managementTextFile = new ManagementCDTextFile();
			
			// Read all of CDs from database and set them to list.
			List<CD> cds = cdController.getAllCDs();
			
			// Write list which was gotten above to text file.
			managementTextFile.setCds(cds);
			managementTextFile.writeFile(filePath);
			
			// Read all of CDs from text file.
			viewAllCD(managementTextFile.readFile(filePath));
		}
		catch (IOException | ClassNotFoundException | SQLException e) {
			System.out.println("Error: " + e);
		}

	}

}
