package exercise85;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.List;

import exercise84.Product;
import exercise84.ProductController;

/**
 * @author ThuyQuynh
 * @since 2016-09-17
 * @version 1.0
 * 
 * This is class search product by name.
 */
public class MainSearchProduct {

	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		ProductController productController = new ProductController();
		
		try {
			// Enter key word for searching.
			System.out.println("========= Search product =================");
			System.out.println("Enter name:");
			String keyword = input.readLine();
			
			// Get search result and show on the screen.
			List<Product> searchResults = productController.searchProduct(keyword);
			if (searchResults.size() == 0)
				System.out.println(keyword + " was not found");
			else {
				System.out.println("======= Search result ============");
				System.out.println("ID\tName\tPrice\tQuantity\tCategory name");
				for (Product product : searchResults) {
					System.out.print(product.printProduct());
				}
			}
				
		}
		catch (IOException | ClassNotFoundException | SQLException e) {
			System.out.println("Error: " + e);
		}

	}

}
