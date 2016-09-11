package exercise133;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <h1>Display a image</h1>
 * The MainDisplayImage program implements an application that
 * 	display a real image by proxy class.
 *
 * @author  Bui Thi Thuy Quynh
 * @version 1.0
 * @since   2016-09-11
 */

public class MainDisplayImage {

	/**
	 * This is the main method which makes use of display()
	 *  method of ProxyImage class.
	 * @param args Unused.
	 * @return Nothing.
	 * @exception IOException On input error.
	 * @see IOException.
	 */
	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("Enter file name: ");
			String fileName = input.readLine();
			
			Image proxy = new ProxyImage(fileName);
			proxy.display();
		}
		catch (IOException ex) {
			System.out.println("Exception: " + ex);
		}
		
	}
}
