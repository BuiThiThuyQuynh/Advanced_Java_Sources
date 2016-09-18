package exercise87;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author ThuyQuynh
 * @since 2016-09-16
 * @version 1.0
 * 
 * This is class control connection connect to product table in database.
 */
public class ProductController {

	ConnectionDB connDB = new ConnectionDB();
	List<Product> products;
	
	/**
	 * This method is used to add new product to table.
	 * @param product Product was added.
	 * @return Nothing.
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public void addProduct(Product product) throws ClassNotFoundException, SQLException {
		try (Connection conn = connDB.connect()) {
			String sql = "insert into product(name, price, amount, image, categoryId, createDate, onSell)"
					+ " values ('" + product.getName() + "', " + product.getPrice() + ", " + product.getAmount()
					+ ", '" + product.getImage() + "', " + product.getCategoryId() + ", '" + product.getCreatedate()
					+ "', " + product.getOnSell() + ");";
			PreparedStatement preStatement = conn.prepareStatement(sql);
			preStatement.execute();
			
			conn.close();
		}
	}
	
	/**
	 * This method is used to update a product
	 * @param product product was updated.
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public void updateProduct(Product product) throws ClassNotFoundException, SQLException {
		try (Connection conn = connDB.connect()) {
			String sql = "update product set price = " + product.getPrice() + ", amount = " + product.getAmount() 
							+ " where id = " + product.getId() + ";";
			PreparedStatement preStatement = conn.prepareStatement(sql);
			preStatement.execute();
			
			conn.close();
		}
	}
	
	/**
	 * This method is used to remove a product from table.
	 * @param id This is id of product was removed.
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public void deleteProduct(int id) throws ClassNotFoundException, SQLException {
		try (Connection conn = connDB.connect()) {
			String sql = "delete from product where id = " + id + ";";
			PreparedStatement preStatement = conn.prepareStatement(sql);
			preStatement.execute();
			
			conn.close();
		}
	}
	
	/**
	 * This method is used to do transaction 1 (add, update and delete a product).
	 * 	- correct data.
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	public void transaction1() throws SQLException, ClassNotFoundException {
		try (Connection conn = connDB.connect()) {
			conn.setAutoCommit(false);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date date = new Date();
			Product product = new Product("Strawberry Cookies", 45000, 50, "strawberrycookies.jpg", 4, sdf.format(date), 1);
			addProduct(product);
			
			product = new Product(1, 6000, 55);
			updateProduct(product);
			
			deleteProduct(19);
			
			conn.commit();
			conn.close();
			System.out.println("Transaction 1 done");
			
		}
	}
	
	/**
	 * This method is used to do transaction 2 (add, update and delete a product).
	 * 	- wrong data with name greater than 150 characters.
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	public void transaction2() throws SQLException, ClassNotFoundException {
		try (Connection conn = connDB.connect()) {
			conn.setAutoCommit(false);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date date = new Date();
			Product product = new Product("Parentheses are sometimes called precedence operators -"
					+ " this means that they can be used to change the other operator's precedence in an expression",
					45000, 50, "strawberrycookies.jpg", 4, sdf.format(date), 1);
			addProduct(product);
			
			product = new Product(13, 125000, 45);
			updateProduct(product);
			
			deleteProduct(23);
			
			conn.commit();
			conn.close();
			System.out.println("Transaction 2 done");
			
		}
	}
	
	/**
	 * This method is used to do transaction 1 (add, update and delete a product).
	 * 	- wrong data with update a product which was removed.
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	public void transaction3() throws SQLException, ClassNotFoundException {
		try (Connection conn = connDB.connect()) {
			conn.setAutoCommit(false);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Product product = new Product("Strawberry Cookies", 45000, 50, "strawberrycookies.jpg", 4, sdf.format("10-09-2016"), 0);
			addProduct(product);
			
			deleteProduct(10);
			
			product = new Product(10, 50000, 10);
			updateProduct(product);
			
			conn.commit();
			conn.close();
			System.out.println("Transaction 3 done");
			
		}
	}
}
