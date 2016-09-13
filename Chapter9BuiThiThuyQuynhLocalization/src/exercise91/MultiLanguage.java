package exercise91;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * <h1>Multiple languages</h1>
 * The MultiLanguage program implements an application that
 * 	prints on the screen list word in vietnamese or english
 *
 * @author  Bui Thi Thuy Quynh
 * @version 1.0
 * @since   2016-09-13
 */
public class MultiLanguage {

	public static void main(String[] args) {
		String language = "en";
		String country = "US";
		
		Locale currentLocal = new Locale(language, country);
		
		ResourceBundle message;
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		try {
			// Choose type of language
			System.out.println("Choose langue");
			System.out.println("1. Vietnamese");
			System.out.println("2. English");
			String choose = input.readLine();
			
			while (!"1".equals(choose) && !"2".equals(choose)) {
				System.out.println("Only choose 1 or 2");
				System.out.println("Choose langue");
				System.out.println("1. Vietnamese");
				System.out.println("2. English");
				choose = input.readLine();
			}
			String bundle = "";
			switch (choose) {
			case "1":
				bundle = "exercise91/resource_vi_VN";
				break;
			case "2":
				bundle = "exercise91/resource_en_US";
				break;

			default:
				break;
			}
			
			// Initialization resourceBundle
			message = ResourceBundle.getBundle(bundle, currentLocal);
			List<String> list = new ArrayList<String>();
			Enumeration<String> keys = message.getKeys();
			
			// Add value of resourceBundle to list
			while (keys.hasMoreElements()) {
				String key = (String) keys.nextElement();
				String value = message.getString(key);
				
				list.add(value);
			}
			
			// Print list value of resourceBundle on the screen
			list.stream().forEach(System.out::println);
		}
		catch (IOException | NumberFormatException e) {
			
		}
	}
}
