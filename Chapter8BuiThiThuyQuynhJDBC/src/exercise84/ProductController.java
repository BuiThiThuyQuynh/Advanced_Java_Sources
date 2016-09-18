package exercise84;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import exercise82.ConnectionDB;

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
			String sql = "insert into product(name, price, amount, categoryid) "
					+ "values ('" + product.getName() + "', " + product.getPrice() 
					+ ", " + product.getAmount() + ", " + product.getCategoryid() + ");";
			
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
			String sql = "update product set price = " + product.getPrice() 
					+ ", amount = " + product.getAmount()
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
	 * This method is used to check product name existing or not.
	 * @param name This is name checked.
	 * @return boolean This is result name existing or not.
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public boolean checkProductName(String name) throws ClassNotFoundException, SQLException {
		try (Connection conn = connDB.connect()) {
			Statement statement  = conn.createStatement();
			String sql = "Select name from product"
					+ " where name like '" + name + "';";
			ResultSet results = statement.executeQuery(sql);
			while (results.next()) {
				String pname = results.getString("name");
				if (name.equals(pname)) {
					conn.close();
					return true;
				}
			}
			conn.close();
			return false;
		}
	}
	
	/**
	 * This method is used to get list product by category id
	 * @param categoryid This is category id was gotten list product.
	 * @return List<Product> List product of a category.
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public List<Product> getListProduct(int categoryid) throws ClassNotFoundException, SQLException {
		products = new ArrayList<Product>();
		try (Connection conn = connDB.connect()) {
			Statement statement = conn.createStatement();
			String sql = "select id, name, price, amount from product"
					+ " where categoryid = " + categoryid;
			ResultSet result = statement.executeQuery(sql);
			while (result.next()) {
				Product product = new Product();
				product.setId(result.getInt(1));
				product.setName(result.getString(2));
				product.setPrice(result.getDouble(3));
				product.setAmount(result.getInt(4));
				
				products.add(product);
			}
			
			conn.close();
		}
		
		return products;
	}
	
	/**
	 * This method is used to search a product in table by name.
	 * @param keyword This is search key.
	 * @return List<Product> This is search result.
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public List<Product> searchProduct(String keyword) throws ClassNotFoundException, SQLException {
		List<Product> results = new ArrayList<Product>();
		try (Connection conn = connDB.connect()) {
			Statement statement = conn.createStatement();
			String sql = "select p.id, p.name, p.price, p.amount, c.name as category from product p inner join category c on p.categoryid = c.id"
					+ " where p.name like '%" + keyword + "%'";
			
			ResultSet resultsSet = statement.executeQuery(sql);
			while (resultsSet.next()) {
				Product product = new Product();
				product.setId(resultsSet.getInt(1));
				product.setName(resultsSet.getString(2));
				product.setPrice(resultsSet.getDouble(3));
				product.setAmount(resultsSet.getInt(4));
				product.setCategoryName(resultsSet.getString(5));
				
				results.add(product);
			}
			
			conn.close();
		}
		
		return results;
	}
	
	/**
	 * This method is used to get all product in table.
	 * @param No.
	 * @return List<Product> This is list product in table.
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public List<Product> getListProduct() throws ClassNotFoundException, SQLException {
		List<Product> results = new ArrayList<Product>();
		try (Connection conn = connDB.connect()) {
			Statement statement = conn.createStatement();
			String sql = "select p.id, p.name, p.price, p.amount, c.name as category "
					+ "from product p inner join category c on p.categoryid = c.id";
			
			ResultSet resultsSet = statement.executeQuery(sql);
			while (resultsSet.next()) {
				Product product = new Product();
				product.setId(resultsSet.getInt(1));
				product.setName(resultsSet.getString(2));
				product.setPrice(resultsSet.getDouble(3));
				product.setAmount(resultsSet.getInt(4));
				product.setCategoryName(resultsSet.getString(5));
				
				results.add(product);
			}
			
			conn.close();
		}
		
		return results;
	}
}
