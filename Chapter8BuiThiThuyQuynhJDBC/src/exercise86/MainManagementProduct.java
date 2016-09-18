package exercise86;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.List;

import exercise84.Category;
import exercise84.CategoryController;
import exercise84.Product;
import exercise84.ProductController;

/**
 * @author ThuyQuynh
 * @since 2016-09-17
 * @version 1.0
 * 
 * This is class manages product included add, search, update,
 * 	delete and view all products. .
 */
public class MainManagementProduct {

	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	static CategoryController categoryController;
	static ProductController productController;
	static boolean view = false;
	
	/**
	 * This method is used to show menu for user.
	 * @param No.
	 * @return Nothing.
	 * @throws IOException 
	 * @throws NumberFormatException 
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 * @throws TransformerException 
	 * @throws ParserConfigurationException 
	 * @throws SAXException 
	 */
	public static void showMenu() throws NumberFormatException, IOException, ClassNotFoundException, SQLException {
		// Show menu
		System.out.println("======== MENU ==========");
		System.out.println("1. Add product");
		System.out.println("2. Search product");
		System.out.println("3. Update product");
		System.out.println("4. Delete product");
		System.out.println("5. View all products");
		System.out.println("6. Exit");
		
		// Check validate of choice 
		int choose = Integer.parseInt(input.readLine());
		while (choose <= 0 || choose > 6) {
			System.out.println("Please choose from 1 to 6");
			System.out.println("======== MENU ==========");
			System.out.println("1. Add product");
			System.out.println("2. Search product");
			System.out.println("3. Update product");
			System.out.println("4. Delete product");
			System.out.println("5. View all products");
			System.out.println("6. Exit");
			choose = Integer.parseInt(input.readLine());
		}
		
		// Check choosing of user and show information for corresponding action 
		switch (choose) {
		case 1:
			view = false;
			addProduct();
			break;
		case 2:
			view = false;
			searchProduct();
			break;
		case 3:
			view = false;
			updateProduct();
			break;
		case 4:
			view = false;
			removeProduct();
			break;
		case 5:
			view = true;
			viewProducts();
			break;
		case 6:
		default:
			System.out.println("Application ended");
			break;
		}
	}

	/**
	 * This method is used to show list products.
	 * @param No.
	 * @return Nothing.
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 * @throws IOException 
	 * @throws NumberFormatException 
	 * @throws TransformerException 
	 * @throws ParserConfigurationException 
	 * @throws SAXException 
	 */
	public static void viewProducts() throws ClassNotFoundException, SQLException, NumberFormatException, IOException {
		// Check list products not null --> show list products.
		// Else application ask user want to add new product or not. 
		// 		If user choose yes, application will allow user add new product to list
		
		if (productController.getListProduct().size() != 0) {
			System.out.println("======= List product ============");
			System.out.println("ID\tName\tPrice\tQuantity\tCategory name");
			for (Product product : productController.getListProduct()) {
				System.out.print(product.printProduct());
			}
		}
		else {
			System.out.println("List products do not have any product");
			System.out.println("Do you add new product to list?");
			System.out.println("1. Yes");
			System.out.println("2. No");
			
			int choose = Integer.parseInt(input.readLine());
			while (choose <= 0 || choose > 2) {
				System.out.println("Please choose 1 or 2");
				System.out.println("Do you add new product to list?");
				System.out.println("1. Yes");
				System.out.println("2. No");
				choose = Integer.parseInt(input.readLine());
			}
			
			switch (choose) {
			case 1:
				addProduct();
				break;
			case 2:
			default:
				break;
			}
		}
		
		if (view)
			showMenu();
	}
	
	/**
	 * This method is used to show list category in database.
	 * @param categories This is list category want to show.
	 * @return Nothing.
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public static void showCategory(List<Category> categories) throws ClassNotFoundException, SQLException {
		System.out.println("ID\tName\tDescription");
		categories.stream().forEach(System.out::print);
	}
	
	/**
	 * This method is used to add new product.
	 * @param No.
	 * @return Nothing.
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 * @throws IOException 
	 * @throws TransformerException 
	 * @throws ParserConfigurationException 
	 * @throws SAXException 
	 * @throws NumberFormatException 
	 */
	public static void addProduct() throws ClassNotFoundException, SQLException, NumberFormatException, IOException {
		// Enter the information for new product, check validate and allow user continue entering if user want
			
			List<Category>categories = categoryController.getCategory();
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
			
			viewProducts();
		
		showMenu();
	}

	/**
	 * This method is used to search product by name (relation search).
	 * @param No.
	 * @return Nothing.
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 * @throws IOException 
	 * @throws TransformerException 
	 * @throws ParserConfigurationException 
	 * @throws SAXException 
	 * @throws NumberFormatException 
	 */
	public static void searchProduct() throws ClassNotFoundException, SQLException, IOException {
		// Check products is null --> allow user add new product to products.
		// Else application require user enter key word for searching and show result. 
		System.out.println("========= Search product =================");
		System.out.println("Enter name:");
		String keyword = input.readLine();
		
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
			showMenu();
	}

	/**
	 * This method is used to delete product by id.
	 * @param No.
	 * @return Nothing.
	 * @throws IOException 
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 * @throws TransformerException 
	 * @throws ParserConfigurationException 
	 * @throws SAXException 
	 * @throws NumberFormatException 
	 */
	public static void removeProduct() throws NumberFormatException, ClassNotFoundException, SQLException, IOException {
		// Check product is null --> allow user add new product to products
		// Else application require user enter key word for deleting and show result. 

		if (productController.getListProduct().size() == 0)
			viewProducts();
		else {
			System.out.println("Enter id of product: ");
			int id = Integer.parseInt(input.readLine());
			
			productController.deleteProduct(id);
			System.out.println(id + " was removed");
			viewProducts();
		}
		
		showMenu();
	}
	
	/**
	 * This method is used to update price and amount of product.
	 * @param No.
	 * @return Nothing.
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 * @throws IOException 
	 * @throws TransformerException 
	 * @throws ParserConfigurationException 
	 * @throws SAXException 
	 * @throws NumberFormatException 
	 */
	public static void updateProduct() throws ClassNotFoundException, SQLException, NumberFormatException, IOException {
		// Check products is null --> allow user add new product to products
		// Else application require user enter key word for deleting and show result. 

		if (productController.getListProduct().size() == 0)
			viewProducts();
		else {
			System.out.println("Choose product want to update");
			viewProducts();
			int id = Integer.parseInt(input.readLine());
			
			while (id <= 0  || id > productController.getListProduct().size()) {
				System.out.println("ID invaliad. Choose again");
				System.out.println("Choose product want to update");
				viewProducts();
				id = Integer.parseInt(input.readLine());
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
			
			Product product = new Product(id, price, amount);
			
			productController.updateProduct(product);
			System.out.println("Product was updated");
			viewProducts();
		}
		
		showMenu();
	}

	/**
	 * This is the main method which is used to manage products
	 * 	included add, update, delete and search product.
	 * @param args Unused.
	 * @return Nothing.
	 * @exception IOException On input error.
	 * @exception NumberFormatException On number format error.
	 * @see IOException.
	 * @see NumberFormatException.
	 */
	public static void main(String[] args) {
		categoryController = new CategoryController();
		productController = new ProductController();
		try {
			// Show menu for user choose and handles this choice.
			showMenu();
		}
		catch (IOException | NumberFormatException | ClassNotFoundException | SQLException e) {
			System.out.println("Error: " + e);
		}
	}

}
