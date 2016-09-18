package exercise84;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.List;

public class MainAddProduct {
	
	public static void showCategory(List<Category> categories) throws ClassNotFoundException, SQLException {
		System.out.println("ID\tName\tDescription");
		categories.stream().forEach(System.out::print);
	}

	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(new 
				InputStreamReader(System.in));
		CategoryController categoryController = new CategoryController();
		ProductController productController = new ProductController();
		List<Category> categories;
		try {
			categories = categoryController.getCategory();
			System.out.println("===== CHOOSE CATEGORY ===========");
			showCategory(categories);
			int category = Integer.parseInt(input.readLine());
			
			while (category <= 0 || category > categories.size()) {
				System.out.println("Invalid. Choose again");
				System.out.println("===== CHOOSE CATEGORY ===========");
				showCategory(categories);
				category = Integer.parseInt(input.readLine());
			}
			
			System.out.println("=== INFORMATION OF PRODUCT ============");
			System.out.println("Enter name: ");
			String name = input.readLine();
			
			while (productController.checkProductName(name)) {
				System.out.println(name + " have already exists");
				System.out.println("Enter name: ");
				name = input.readLine();
			}
			
			System.out.println("Enter price");
			double price = Double.parseDouble(input.readLine());
			
			while (price < 0) {
				System.out.println("Invalid price");
				System.out.println("Enter price");
				price = Double.parseDouble(input.readLine());
			}
			
			System.out.println("Enter quantity: ");
			int amount = Integer.parseInt(input.readLine());
			
			while (amount < 0) {
				System.out.println("Invalid quantity");
				System.out.println("Enter quantity");
				amount = Integer.parseInt(input.readLine());
			}
			
			Product product = new Product(name, price, amount, category);
			productController.addProduct(product);
			
			List<Product> listProduct = productController.getListProduct(category);
			System.out.println("ID\tName\tPrice\tQuantity");
			listProduct.stream().forEach(System.out::println);
			
			
		}
		catch (IOException | ClassNotFoundException | SQLException e) {
			System.out.println("Error: " + e);
		}

	}

}
