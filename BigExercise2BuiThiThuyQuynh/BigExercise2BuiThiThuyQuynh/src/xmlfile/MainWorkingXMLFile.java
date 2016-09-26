package xmlfile;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.xml.sax.SAXException;

import jdbc.CD;
import jdbc.CDController;

/**
 * @author ThuyQuynh
 * @since 2016-09-19
 * @version 1.0
 * 
 * This is an application for get all of CDs from cd table in database and 
 * 	write them to xml file, then read list CDs from xml file
 * 	and print on the screen.
 */
public class MainWorkingXMLFile {

	/**
	 * This method is used to show all of CDs in xml file.
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
		String filePath = "src/xmlfile/cd.xml";
		try {
			CDController cdController = new CDController();
			ManagementCDByXML manaByXML = new ManagementCDByXML();
			
			// Read all of CDs from database and set them to list.
			List<CD> cds = cdController.getAllCDs();
			
			// Write list which was gotten above to text file.
			manaByXML.setCds(cds);
			manaByXML.writeCDs(filePath);
			
			// Read all of CDs from text file.
			viewAllCD(manaByXML.readCDs(filePath));
		}
		catch (IOException | SAXException 
				| ParserConfigurationException 
				| TransformerException 
				| ClassNotFoundException 
				| SQLException e) {
			System.out.println("Error: " + e);
		}
	}

}
