package textfile;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import jdbc.CD;

/**
 * @author ThuyQuynh
 * @since 2016-09-19
 * @version 1.0
 * 
 * This is class manages connection connect to cd.txt file.
 */
public class ManagementCDTextFile {

	List<CD> cds;
	
	public ManagementCDTextFile() {
		
	}
	
	public List<CD> getCds() {
		return cds;
	}

	public void setCds(List<CD> cds) {
		this.cds = cds;
	}

	/**
	 * This method is used to read all of CDs from text file.
	 * @param filePath This is path of text file.
	 * @return List<CD> This is list CDs from text file.
	 * @throws ClassNotFoundException
	 * @throws IOException
	 */
	public List<CD> readFile(String filePath) throws ClassNotFoundException, IOException {
		cds = new ArrayList<CD>();
		
		ObjectInputStream in =  new ObjectInputStream(new 
				BufferedInputStream(new FileInputStream(filePath)));;
		try {
			while (true) {
				CD cd = (CD) in.readObject();
				cds.add(cd);
			}
		}
		catch (IOException ex) {
			
		}
		finally {
			in.close();
		}
		
		return cds;
	
	}
	
	/**
	 * This method is used to write list CDs to text file
	 * @param filePath This is path of text file.
	 * @return Nothing.
	 */
	public void writeFile(String filePath) {
		ObjectOutputStream out;
		try {
			out = new ObjectOutputStream(new FileOutputStream(filePath));
			for (CD cd : cds)
				out.writeObject(cd);
			
			out.close();
			System.out.println("File was saved");
		}
		catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
