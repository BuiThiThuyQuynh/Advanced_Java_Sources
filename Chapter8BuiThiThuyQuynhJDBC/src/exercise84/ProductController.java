package exercise84;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import exercise82.ConnectionDB;

public class ProductController {

	ConnectionDB connDB = new ConnectionDB();
	List<Product> products;
	
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
	
	public void deleteProduct(int id) throws ClassNotFoundException, SQLException {
		try (Connection conn = connDB.connect()) {
			String sql = "delete from product where id = " + id + ";";
			
			PreparedStatement preStatement = conn.prepareStatement(sql);
			preStatement.execute();
			
			conn.close();
		}
	}
	
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
