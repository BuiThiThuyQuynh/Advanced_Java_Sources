package exercise92;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author Bui Thi Thuy Quynh
 * @date 13/09/2016
 * @version 1.0
 * 
 * @description Class handles for others classes about management CD
 */
public class MainManagementCD {

	public static void main(String[] args) {
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			List<CD> cds = new ArrayList<CD>();
			ManagementCD managementCDs = new ManagementCD();
			
			// Choose language
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
				bundle = "exercise92/resource_vi_VN";
				break;
			case "2":
				bundle = "exercise92/resource_en_US";
				break;

			default:
				break;
			}
			
			Locale currentLocal = new Locale("en", "US");
			ResourceBundle message = ResourceBundle.getBundle(bundle, currentLocal);
				
			boolean flag = true;
			int i = 0;
			while (flag) {
				// Enter and check validate information for a CD
				System.out.println("------- CD " + (i + 1) + "--------");
				
				System.out.println(message.getString("enterID") + ": ");
				String id = input.readLine();
				
				System.out.println(message.getString("enterName") + ": ");
				String name = input.readLine();
				
				System.out.println(message.getString("enterSinger") + ": ");
				String singer = input.readLine();
				
				System.out.println(message.getString("enterNumberSongs") + ": ");
				int numOfSongs = Integer.parseInt(input.readLine());
				
				while (numOfSongs <= 0) {
					System.out.println(message.getString("errorNumberSongs"));
					System.out.println(message.getString("enterNumberSongs") + ": ");
					numOfSongs = Integer.parseInt(input.readLine());
				}
				
				System.out.println(message.getString("enterPrice") + ": ");
				double price = Double.parseDouble(input.readLine());
				
				while (price <= 0) {
					System.out.println(message.getString("errorPrice"));
					System.out.println(message.getString("enterPrice") + ": ");
					price = Double.parseDouble(input.readLine());
				}
				
				cds.add(new CD(id, name, singer, numOfSongs, price, bundle));
				
				// Add CD to list and print list CDs
				managementCDs.setCds(cds);
				managementCDs.setLanguage(bundle);
				System.out.println(managementCDs.toString());
				
				// Loop add CD if user want
				System.out.println(message.getString("askUser"));
				System.out.println("1. " + message.getString("yes"));
				System.out.println("2. " + message.getString("no"));
				String temp = input.readLine();
				while (!"1".equals(temp) && !"2".equals(temp)) {
					System.out.println(message.getString("errorChoose"));
					System.out.println(message.getString("askUser"));
					System.out.println(message.getString("yes"));
					System.out.println(message.getString("no"));
					temp = input.readLine();
				}

				switch(temp) {
				case "1":
					continue;
				case "2":
					System.out.println(message.getString("end"));
					flag = false;
					break;
				default:
					break;
				}
			}
		}
		catch (IOException | NumberFormatException | ArrayIndexOutOfBoundsException ex) {
			System.out.println("Exception: " + ex);
		}

	}

}
